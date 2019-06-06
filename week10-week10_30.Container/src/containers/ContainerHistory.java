package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHistory {

    private List<Double> history;
    
    public ContainerHistory() {
        history = new ArrayList<Double>();
    }
    
    public void add(double situation) {
        history.add(situation);
    }
    
    public void reset() {
        history.clear();
    }
    
    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        
        return Collections.max(history);
    }
    
    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        
        return Collections.min(history);
    }
    
    public double average() {
        if (history.isEmpty()) {
            return 0;
        }
        
        double total = 0;
        
        for (Double d : history) {
            total += d;
        }
        
        return total / history.size();
    }
    
    public double greatestFluctuation() {
        if (history.size() <= 1) {
            return 0;
        }
        
        double maxFluctuation = 0;
        
        for (int i = 1; i < history.size(); i++) {
            double diff = Math.abs(history.get(i) - history.get(i - 1));
            
            if (diff > maxFluctuation) {
                maxFluctuation = diff;
            }
        }
        
        return maxFluctuation;
    }
    
    public double variance() {
        if (history.size() <= 1) {
            return 0;
        }
        
        double average = average();
        double variance = 0;
        
        for (Double d : history) {
            variance += Math.pow((d - average), 2);
        }
        variance /= (history.size() - 1);
        
        return variance;
    }
    
    @Override
    public String toString() {
        return history.toString();
    }
}