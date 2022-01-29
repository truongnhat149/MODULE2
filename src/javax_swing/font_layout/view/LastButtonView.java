package javax_swing.font_layout.view;

import javax_swing.font_layout.controller.LastButtonListener;
import javax_swing.font_layout.model.LastButtonModel;

import javax.swing.*;
import java.awt.*;

public class LastButtonView extends JFrame {
    private LastButtonModel lastButtonModel;
    private JLabel jLabel;
    public LastButtonView() {
        this.lastButtonModel = new LastButtonModel();

        this.init();
    }

    public void init() {
        this.setTitle("LastButton");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);

        JPanel jPanel_Center = new JPanel();
        jPanel_Center.setLayout(new GridLayout(2, 2));

        // tạo listener
        LastButtonListener lastButtonListener = new LastButtonListener(this);

        // tạo font
        Font font = new Font("Arial", Font.BOLD, 30);

        JButton jButton_1 = new JButton("1");
        jButton_1.setFont(font);
        jButton_1.addActionListener(lastButtonListener);

        JButton jButton_2 = new JButton("2");
        jButton_2.setFont(font);
        jButton_2.addActionListener(lastButtonListener);

        JButton jButton_3 = new JButton("3");
        jButton_3.setFont(font);
        jButton_3.addActionListener(lastButtonListener);

        JButton jButton_4 = new JButton("4");
        jButton_4.setFont(font);
        jButton_4.addActionListener(lastButtonListener);

        jPanel_Center.add(jButton_1);
        jPanel_Center.add(jButton_2);
        jPanel_Center.add(jButton_3);
        jPanel_Center.add(jButton_4);

        JPanel jPanel_Footer = new JPanel();
        jLabel = new JLabel("-------");
        jLabel.setFont(font);
        jPanel_Footer.add(jLabel);

        this.setLayout(new BorderLayout());

        this.add(jPanel_Center, BorderLayout.CENTER);
        this.add(jPanel_Footer, BorderLayout.SOUTH);
        this.setVisible(true);

    }

    public void changeToo_1() {
        this.lastButtonModel.setValue_1();
        jLabel.setText("Last button " + this.lastButtonModel.getValue());
    }
    public void changeToo_2() {
        this.lastButtonModel.setValue_2();
        jLabel.setText("Last button " + this.lastButtonModel.getValue());
    }
    public void changeToo_3() {
        this.lastButtonModel.setValue_3();
        jLabel.setText("Last button " + this.lastButtonModel.getValue());
    }
    public void changeToo_4() {
        this.lastButtonModel.setValue_4();
        jLabel.setText("Last button " + this.lastButtonModel.getValue());
    }
}
