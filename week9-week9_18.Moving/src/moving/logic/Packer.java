/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.List; 
import java.util.*; 
import moving.domain.Thing;
import moving.domain.Box;

/**
 *
 * @author lesleycheung
 */
public class Packer {
    private int boxesVolume; 
    private final List <Box> boxes; 
    
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume; 
        this.boxes = new ArrayList<Box>();
    }
    
    public List<Box> packThings(List<Thing> things) {
        // new list that stores boxes 
        Box box = new Box(this.boxesVolume);
        // adding things to boxes 
        for (Thing t : things) {
            box.addThing(t); 
            boxes.add(box); 
        }
        // return the boxes 
        return this.boxes; 
        
    }
}
