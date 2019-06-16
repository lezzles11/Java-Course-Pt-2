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

public class ZeroCalculator implements ActionListener {
    private JTextField input; 
    private JTextField output; 
    private JButton z; 
    public ZeroCalculator(JTextField input, JTextField output, JButton button) {
        this.input = input; 
        this.output = output; 
        this.z = button; 
    }
    @Override 
    public void actionPerformed(ActionEvent ae) {
        this.input.setText("");
        this.output.setText("" + 0);
        z.setEnabled(false);
    }
}
