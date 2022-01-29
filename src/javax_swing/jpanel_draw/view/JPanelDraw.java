package javax_swing.jpanel_draw.view;

import javax.swing.*;
import java.awt.*;

public class JPanelDraw extends JPanel {
    public JPanelDraw() {
        this.setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.red);
        g.drawLine(20, 20, 100, 100);

        g.setColor(Color.blue);
        g.drawOval(255, 255, 70, 70);

        g.setColor(Color.green);
        g.drawRect(50,100, 30, 90);

        g.setColor(Color.pink);
        g.fillOval(600, 400, 50 ,50);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(100, 100, 150, 150);

        g.setColor(Color.YELLOW);
        g.drawString("Code Gym", 149, 149);
    }
}
