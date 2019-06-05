/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author lesleycheung
 */
public class Item implements Comparable<Item>, Thing {
    private String name; 
    private final int volume; 
    public Item (String name, int volume) {
        this.name = name; 
        this.volume = volume; 
    }
    
    @Override
    public int getVolume() {
        return this.volume; //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getName() {
        return this.name; 
    }
    
    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }
    
    public int compareTo(Item o) {
        return this.volume - o.getVolume();
    }
}
