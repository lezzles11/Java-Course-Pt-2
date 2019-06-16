/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lesleycheung
 */
import java.awt.event.*; 
import javax.swing.*; 

public class AdditionCalculator implements ActionListener {
    private JTextField input; 
    private JTextField output; 
    private JButton z; 
    
    public AdditionCalculator(JTextField input, JTextField output, JButton z){
        this.input = input; // output
        this.output = output; // input
        this.z = z; 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int bufferOut = 0; 
        int bufferIn = 0; 
        try {
            bufferIn = Integer.parseInt(input.getText());
            bufferOut = Integer.parseInt(output.getText());
            bufferOut += bufferIn; 
            this.input.setText("");
            this.output.setText("" + bufferOut);
            if (Integer.parseInt(this.output.getText()) == 0) {
                z.setEnabled(false); 
            } else {
                z.setEnabled(true); 
            } 
        } catch (NumberFormatException nfe) {
            this.input.setText("");
            
        }
    }
}
