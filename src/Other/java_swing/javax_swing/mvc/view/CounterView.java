package javax_swing.mvc.view;

import javax_swing.mvc.controler.CounterListener;
import javax_swing.mvc.model.CounterModel;
import org.w3c.dom.css.Counter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    private CounterModel counterModel;
    private JButton jButton_up;
    private JButton jButton_down;
    private JLabel jLabel_value;

    public CounterView() {
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Counter");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new CounterListener(this);

        jButton_up = new JButton("UP");
        jButton_up.addActionListener(ac);

        jButton_down = new JButton("DOWN");
        jButton_down.addActionListener(ac);

        jLabel_value = new JLabel(this.counterModel.getValue() + " ", JLabel.CENTER);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jButton_up, BorderLayout.WEST);
        jPanel.add(jButton_down, BorderLayout.EAST);
        jPanel.add(jLabel_value, BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);
    }
    public void increament() {
        this.counterModel.increament();
        this.jLabel_value.setText(this.counterModel.getValue() +"");

    }

    public void decrement() {
        this.counterModel.decrement();
        this.jLabel_value.setText(this.counterModel.getValue() + "");
    }
}
