package javax_swing.layout;

import javax.swing.*;
import java.awt.*;

public class GridLasyout extends JFrame {
    public GridLasyout() {
        this.setTitle("Grid_Layout");
        this.setSize(600, 500);

        // căn giữa cửa sổ chương trình
        this.setLocationRelativeTo(null);

        //set lay out
        GridLayout gridLayout = new GridLayout();
        GridLayout gridLayout1 = new GridLayout(4, 4);
        GridLayout gridLayout2 = new GridLayout(4, 4, 25, 25);
        this.setLayout(gridLayout2);
//
//        JButton jButton = new JButton("1");
//        JButton jButton1 = new JButton("2");
//        JButton jButton2 = new JButton("3");

        // add thành phần
        for (int i = 0; i < 16; i++)
        {
            JButton jButton3 = new JButton(i + "");
            this.add(jButton3);
        }

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridLasyout();
    }
}
