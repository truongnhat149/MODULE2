package javax_swing.layout;


import javax.swing.*;
import java.awt.*;

public class FlowLayout extends JFrame {
    public FlowLayout() {
        this.setTitle("Vi_Du_Flow_Layout");
        this.setSize(600,400);
        // căn giữa cửa sổ chương trình
        this.setLocationRelativeTo(null);

        // set Layout
        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout1 = new FlowLayout();
        FlowLayout flowLayout2 = new FlowLayout();
//        this.setLayout(flowLayout);
        this.setLayout(flowLayout.getLayout());

        JButton jbutton = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");

        // add thành phần
        this.add(jbutton);
        this.add(jButton2);
        this.add(jButton3);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayout();
    }

}
