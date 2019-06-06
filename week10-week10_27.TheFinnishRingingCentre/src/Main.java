/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lesleycheung
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RingingCentre rt = new RingingCentre();
        rt.observe(new Bird("Nebelkrähe", "Corvus corone cornix", 2000), "Berlin");
        rt.observations(new Bird("Varsi", "Corvus corone cornix", 2012));
    }
    
}
