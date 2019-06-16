/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lesleycheung
 */
import javax.swing.*; 
import java.awt.event.*; 

public class MinusCalculator implements ActionListener {
    private JTextField input; 
    private JTextField output; 
    private JButton z; 
    
    public MinusCalculator(JTextField input, JTextField output, JButton button) {
        this.input = input; 
        this.output = output; 
        this.z = button; 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int out = 0; 
        int in = 0; 
        try {
            in = Integer.parseInt(input.getText());
            out = Integer.parseInt(output.getText());
            out -= in; 
            this.input.setText("");
            this.output.setText("" + out);
            if (Integer.parseInt(this.output.getText()) == 0) {
                z.setEnabled(false); 
            } else {
                z.setEnabled(true);
            } 
            
        } catch (NumberFormatException ae) {
            this.input.setText("");
        }
    }
    
}
