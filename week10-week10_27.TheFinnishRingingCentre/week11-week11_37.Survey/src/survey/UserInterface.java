package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        //frame.setPreferredSize(new Dimension(200, 300));
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        frame.setVisible(true);
    }

    public void createComponents(Container container){
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        container.add(new JCheckBox("Yes!"));
        container.add(new JCheckBox("No!"));
        
        container.add(new JLabel("Why?"));
        
        ButtonGroup bg = new ButtonGroup();
        JRadioButton nr = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");
        
        bg.add(nr);
        bg.add(fun);
        
        container.add(nr);
        container.add(fun);
        
        container.add(new JButton("Done!"));
        
    }
    public JFrame getFrame() {
        return frame;
    }
}