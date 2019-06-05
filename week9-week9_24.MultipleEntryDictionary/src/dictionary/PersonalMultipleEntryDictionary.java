/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.*;

/**
 *
 * @author lesleycheung
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> dict; 
    
    public PersonalMultipleEntryDictionary() {
        this.dict = new HashMap<String, Set <String>>();
    }
    
    @Override
    public void add(String word, String entry) {
        if (!this.dict.containsKey(word)) {
            this.dict.put(word, new HashSet<String>()); 
        }
        Set<String> finish = this.dict.get(word); 
        finish.add(entry); 
    }

    @Override
    public Set<String> translate(String word) {
        Set<String> translate = new HashSet<String>();
        if (!this.dict.containsKey(word)) {
            return null; 
        }
        for (String translated : this.dict.get(word)) {
            translate.add(translated);
        }
        return translate; 
        
    }

    @Override
    public void remove(String word) {
        this.dict.remove(word); 
    }
    
    
}
