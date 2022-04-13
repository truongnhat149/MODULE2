package javax_swing.layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutt extends JFrame {
    public BorderLayoutt() {
        this.setTitle("Border _ Layout");
        this.setSize(500,300);
        this.setLocationRelativeTo(null);

        //set layout
        BorderLayout borderLayout = new BorderLayout();
        BorderLayout boderLayout2 = new BorderLayout();
        BorderLayout borderLayout3 = new BorderLayout(50, 70);

        this.setLayout(borderLayout);

        JButton jButton = new JButton( "1");
        JButton jButton2 = new JButton( "2");
        JButton jButton3 = new JButton( "3");
        JButton jButton4 = new JButton( "4");
        JButton jButton5 = new JButton( "5");
        this.add(jButton, BorderLayout.NORTH);
        this.add(jButton2, BorderLayout.CENTER);
        this.add(jButton3, BorderLayout.WEST);
        this.add(jButton4, BorderLayout.SOUTH);
        this.add(jButton5, BorderLayout.EAST);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutt();
    }
}
