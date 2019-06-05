/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.*;

/**
 *
 * @author lesleycheung
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> allSensors; 
    private ArrayList<Integer> allReadings; 
    
    public AverageSensor(){
        this.allSensors = new ArrayList<Sensor>();
        this.allReadings = new ArrayList<Integer>();
    }
    public void addSensor(Sensor additional) {
        this.allSensors.add(additional); 
    }
    
    @Override
    public boolean isOn(){
        boolean allOn = false; 
        for (Sensor sensor : allSensors) {
            if (sensor.isOn()) {
                allOn = true; 
            } else {
                allOn = false; 
                break; 
            }
        }
        if (allOn) {
            return true; 
        } else {
            return false; 
        }
    }
    
    /**
     *
     */
    @Override
    public void on(){
        for (Sensor sensor: allSensors) {
            sensor.on();
        }
    }
    
    @Override
    public void off(){
        for (Sensor sensor : allSensors) {
            sensor.off();
        }
    }
    
    @Override
    public int measure() {
        if (this.allSensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException();
        } else {
            int measureSum = 0; 
            int average = 0; 
            for (Sensor sensor : allSensors) {
                measureSum += sensor.measure();
            }
            
            average = measureSum / allSensors.size();
            
            this.allReadings.add(average); 
            return average; 
        }
    }
    
    public List<Integer> readings() {
        return (List) this.allReadings; 
    }
    
}
