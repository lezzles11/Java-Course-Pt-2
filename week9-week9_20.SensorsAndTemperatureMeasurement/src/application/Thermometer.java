/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author lesleycheung
 */
public class Thermometer implements Sensor {
    private Random num;
    private Boolean isOn; 
    public Thermometer() {
        this.num = new Random();
        this.isOn = false; 
    }
    
    /**
     *
     * @return
     */
    @Override
    public int measure() {
        if (isOn) {
            int next = num.nextInt(61) - 30;
            return next; 
        } else {
            throw new IllegalStateException("No");
        }
    }
    
    public boolean isOn(){
        if (this.isOn) {
            return true; 
        } else {
            return false; 
        }
    }
    
    public void on(){
        this.isOn = true; 
    }
    
    public void off(){
        this.isOn = false; 
    }
}
