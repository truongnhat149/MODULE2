package javax_swing.jpanel_draw.view;

import javax.swing.*;
import java.awt.*;

public class DrawExampleView extends JFrame {
    public DrawExampleView() {
        this.setTitle("Draw Example");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanelDraw jPanelDraw = new JPanelDraw();

        this.setLayout(new BorderLayout());

        this.add(jPanelDraw, BorderLayout.CENTER);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new DrawExampleView();
    }
}
