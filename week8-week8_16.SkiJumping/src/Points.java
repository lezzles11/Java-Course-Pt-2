
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lesleycheung
 */
public class Points {
    private Random random; 
    private ArrayList<Integer> judgeVotes; 
    private int length; 
    
    public Points() {
        this.random = new Random();
        this.length = random.nextInt(61) + 60; 
        this.judgeVotes = new ArrayList<Integer>();
        
        for (int i = 0; i < 5; i++) {
            this.judgeVotes.add(this.random.nextInt(11) + 10);
        }
    }
   
    
    public int getLength(){
        return this.length; 
    }
    
    public String printVotes() {
        String votes = "[";
        for (int i = 0; i < 4; i++) {
            votes += this.judgeVotes.get(i) + ", ";
        } votes += this.judgeVotes.get(4) + "]";
        return votes; 
    }
    
    public int getValidVotes(){
        Collections.sort(this.judgeVotes);
        int total = 0; 
        for (int i = 1; i < 4; i++) {
            total += this.judgeVotes.get(i);
        } return total; 
    }
    
    public int getPoints() {
        return this.length + this.getValidVotes();
    }
    
    @Override
    public String toString() {
        String results = "    length: " + this.length + "\n" + "    judge votes: " + this.printVotes();
        return results;
    }
}
