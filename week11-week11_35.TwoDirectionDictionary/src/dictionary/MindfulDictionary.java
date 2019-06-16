/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.util.*; 
import java.io.*; 

/**
 *
 * @author lesleycheung
 */
public class MindfulDictionary {
    private Map<String, String> dictionary;
    private Scanner reader;
    private FileWriter file;
    private String path;
    
    public MindfulDictionary(){
        this.dictionary = new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file){
        this.dictionary = new HashMap<String, String>();
        this.path = file;
        
    }
    
    public void add(String word, String translation){
        if(!this.dictionary.containsKey(word)){
                this.dictionary.put(word, translation);
                this.dictionary.put(translation, word);
        }

    }   
    
    public boolean load(){
        try{
            this.reader = new Scanner(new File(path));
            
            while(this.reader.hasNextLine()){
                String [] parts =this.reader.nextLine().split(":");
                add(parts[0], parts[1]);
            }
            
            return true;

        }catch(Exception e){
            return false;
        }

    }
    
    public boolean save(){
        try{
            this.file = new FileWriter(new File(path));
            String words = "";
            for(String s : this.dictionary.keySet()){
                if(!words.contains(this.dictionary.get(s))){
                    words += s;
                    file.append(s+":"+this.dictionary.get(s)+"\n");
                }
                
            }
            this.file.close();
            return true;
        }catch(Exception e){
            return false;
        }

    }
    
    public String translate(String word){
        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }else{
            return null;
        }
    }
    
    public void remove(String word){
        String translation = "";
        if(this.dictionary.containsKey(word)){
            translation = this.dictionary.get(word);
            this.dictionary.remove(word);
            this.dictionary.remove(translation);
        }
    }
}

