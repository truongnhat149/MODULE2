package javax_swing.jpanel_look_and_feel;

import javax.swing.*;
import java.awt.*;

public class MyCalculator extends JFrame {
    public MyCalculator() {
        this.setTitle("Calculator");
        this.setSize(200,300);
        // set vị trí giữa
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField jTextField = new JTextField(100);
        JPanel jPanel_head = new JPanel();
        jPanel_head.setLayout(new BorderLayout());
        jPanel_head.add(jTextField, BorderLayout.CENTER);

        JButton jButton = new JButton("0");
        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");
        JButton jButton5 = new JButton("5");
        JButton jButton6 = new JButton("6");
        JButton jButton7 = new JButton("7");
        JButton jButton8 = new JButton("8");
        JButton jButton9 = new JButton("9");
        JButton jButton_cong = new JButton("+");
        JButton jButton_tru = new JButton("-");
        JButton jButton_nhan = new JButton("*");
        JButton jButton_chia = new JButton("/");
        JButton jButton_bang = new JButton("=");

        JPanel jPanel_buttons = new JPanel();

        jPanel_buttons.setLayout(new GridLayout(5, 3));
        jPanel_buttons.add(jButton);
        jPanel_buttons.add(jButton1);
        jPanel_buttons.add(jButton2);
        jPanel_buttons.add(jButton3);
        jPanel_buttons.add(jButton4);
        jPanel_buttons.add(jButton5);
        jPanel_buttons.add(jButton6);
        jPanel_buttons.add(jButton7);
        jPanel_buttons.add(jButton8);
        jPanel_buttons.add(jButton9);
        jPanel_buttons.add(jButton_cong);
        jPanel_buttons.add(jButton_tru);
        jPanel_buttons.add(jButton_nhan);
        jPanel_buttons.add(jButton_chia);
        jPanel_buttons.add(jButton_bang);

        this.setLayout(new BorderLayout());
        this.add(jPanel_head, BorderLayout.NORTH);
        this.add(jPanel_buttons, BorderLayout.CENTER);

        this.setVisible(true);

    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MyCalculator();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
