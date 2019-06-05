/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author lesleycheung
 */
public class ConstantSensor implements Sensor {
    private int constant;
    public ConstantSensor (int temp) {
        this.constant = temp; 
    }
    
    public int measure() {
        return this.constant;
    }
    
    public boolean isOn(){
        return true; 
    }
    
    public void on(){
    }
    
    public void off(){
    }
    
}
