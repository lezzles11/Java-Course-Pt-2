
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lesleycheung
 */
public class PromissoryNote {
    private HashMap<String, Double> list; 
    
    public PromissoryNote() {
        this.list = new HashMap<String, Double>(); 
    }
    
    public void setLoan(String toWhom, double value) {
        this.list.put(toWhom, value); 
    }
    
    public double howMuchIsTheDebt(String whose) { 
        if (list.containsKey(whose)) { // no need to put this.list here - why?
            double loan = list.get(whose); 
            return loan; 
        }
        return 0; 
    }
    
}
