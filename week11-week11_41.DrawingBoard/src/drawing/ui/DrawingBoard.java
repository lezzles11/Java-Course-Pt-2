package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.BLACK); 
        graphics.fillRect(100, 50, 50, 50); 
        graphics.setColor(Color.BLACK); 
        graphics.fillRect(250, 50, 50, 50);
        graphics.setColor(Color.BLACK); 
                        //
        graphics.fillRect(50, 210, 50, 50); 
        graphics.setColor(Color.BLACK); 
        graphics.fillRect(300, 210, 50, 50);
        graphics.setColor(Color.BLACK); 
        graphics.fillRect(100, 260, 200, 50);
    }
}
