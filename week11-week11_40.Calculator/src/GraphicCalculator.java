
import java.awt.*; 
import javax.swing.*; 

public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private JTextField output;
    private JTextField input;
    private JButton buttonZ;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        output = new JTextField("0");
        output.setEnabled(false);
        input = new JTextField();
        container.add(output);
        container.add(input);
        container.add(createPanel());

    }

    public JPanel createPanel() {

        JPanel panel = new JPanel(new GridLayout(1, 3));
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");

        buttonZ = new JButton("Z");
        buttonZ.setEnabled(false);

        buttonZ.addActionListener(new ZeroCalculator(input, output, buttonZ));
        minus.addActionListener(new MinusCalculator(input, output, buttonZ));
        plus.addActionListener(new AdditionCalculator(input, output, buttonZ));
        
        
        
        panel.add(plus);
        panel.add(minus);
        panel.add(buttonZ);
        return panel;

    }

    public JFrame getFrame() {
        return frame;
    }
}