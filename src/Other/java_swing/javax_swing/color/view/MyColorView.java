package javax_swing.color.view;

import javax_swing.color.controller.MyColorListener;
import javax_swing.color.model.MyColorModel;

import javax.swing.*;
import java.awt.*;

public class MyColorView extends JFrame {
    private MyColorModel myColorModel;
    private JLabel jLabel;

    public MyColorView() {
        this.myColorModel = new MyColorModel();
        this.init();
    }

    public void init() {
        this.setTitle("My Color");
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font_text = new Font("Arial", Font.BOLD, 70);
        jLabel = new JLabel("Text....");
        jLabel.setFont(font_text);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(3, 2));

        Font font = new Font("Arial", Font.BOLD, 40);
        MyColorListener myColorListener = new MyColorListener(this);

        JButton jButton_text_red = new JButton("Red Text");
        jButton_text_red.setFont(font);
        jButton_text_red.setForeground(Color.red);
        jButton_text_red.addActionListener(myColorListener);

        JButton jButton_text_yellow = new JButton("Yellow Text");
        jButton_text_yellow.setFont(font);
        jButton_text_yellow.setForeground(Color.YELLOW);
        jButton_text_yellow.addActionListener(myColorListener);

        JButton jButton_text_green = new JButton("Green Text");
        jButton_text_green.setFont(font);
        jButton_text_green.setForeground(Color.green);
        jButton_text_green.addActionListener(myColorListener);

        JButton jButton_background_red = new JButton("Red Background");
        jButton_background_red.setFont(font);
        jButton_background_red.setBackground(Color.RED);
        jButton_background_red.setOpaque(true);
//        jButton_background_red.setBorderPainted(false);
        jButton_background_red.addActionListener(myColorListener);

        JButton jButton_background_yellow = new JButton("Yellow Backgrouond");
        jButton_background_yellow.setFont(font);
        jButton_background_yellow.setBackground(Color.YELLOW);
        jButton_background_yellow.setOpaque(true);
        jButton_background_yellow.addActionListener(myColorListener);

        JButton jButton_background_green = new JButton("Green Background");
        jButton_background_green.setFont(font);
        jButton_background_green.setBackground(Color.GREEN);
        jButton_background_green.setOpaque(true);
        jButton_background_green.addActionListener(myColorListener);

        jPanel.add(jButton_text_red);
        jPanel.add(jButton_text_yellow);
        jPanel.add(jButton_text_green);
        jPanel.add(jButton_background_red);
        jPanel.add(jButton_background_yellow);
        jPanel.add(jButton_background_green);

        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.NORTH);
        this.add(jPanel, BorderLayout.CENTER);
        this.setVisible(true);

    }
    public void changeTextColor(Color color) {
        this.jLabel.setForeground(color);
    }

    public void changeBackground(Color color) {
        this.jLabel.setBackground(color);
        this.jLabel.setOpaque(true);
    }
}
