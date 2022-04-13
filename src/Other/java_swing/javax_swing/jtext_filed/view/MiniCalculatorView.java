package javax_swing.jtext_filed.view;

import javax_swing.jtext_filed.controller.MiniCalculatorListener;
import javax_swing.jtext_filed.model.MiniCalculatorModel;

import javax.swing.*;
import java.awt.*;

public class MiniCalculatorView extends JFrame {
    private MiniCalculatorModel miniCalculatorModel;
    private JTextField jTextField_First_Value;
    private JTextField jTextField_Second_Value;
    private JTextField jTextField_answer;

    public MiniCalculatorView() throws HeadlessException {
        this.miniCalculatorModel = new MiniCalculatorModel();
        this.init();
    }

    private void init() {
        this.setTitle("Mini Calculator");
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 40);

        JLabel jLabel_firstValue = new JLabel("1st Value");
        jLabel_firstValue.setFont(font);

        JLabel jLabel_secondValue = new JLabel("2st Value");
        jLabel_secondValue.setFont(font);

        JLabel jLabel_answer = new JLabel("Answer");
        jLabel_answer.setFont(font);

        jTextField_First_Value = new JTextField(50);
        jTextField_First_Value.setFont(font);

        jTextField_Second_Value = new JTextField(50);
        jTextField_Second_Value.setFont(font);

        jTextField_answer = new JTextField(50);
        jTextField_answer.setFont(font);

        JPanel jPanelIO = new JPanel();
        jPanelIO.setLayout(new GridLayout(3, 2, 10, 10));
        jPanelIO.add(jLabel_firstValue);
        jPanelIO.add(jTextField_First_Value);
        jPanelIO.add(jLabel_secondValue);
        jPanelIO.add(jTextField_Second_Value);
        jPanelIO.add(jLabel_answer);
        jPanelIO.add(jTextField_answer);

        MiniCalculatorListener miniCalculatorListener = new MiniCalculatorListener(this);

        JButton jButton_plus = new JButton("+");
        jButton_plus.setFont(font);
        jButton_plus.addActionListener(miniCalculatorListener);

        JButton jButton_minus = new JButton("-");
        jButton_minus.setFont(font);
        jButton_minus.addActionListener(miniCalculatorListener);

        JButton jButton_multiply = new JButton("*");
        jButton_multiply.setFont(font);
        jButton_multiply.addActionListener(miniCalculatorListener);

        JButton jButton_divide = new JButton("/");
        jButton_divide.setFont(font);
        jButton_divide.addActionListener(miniCalculatorListener);

        JButton jButton_pow = new JButton("^");
        jButton_pow.setFont(font);
        jButton_pow.addActionListener(miniCalculatorListener);

        JButton jButton_mod = new JButton("%");
        jButton_mod.setFont(font);
        jButton_mod.addActionListener(miniCalculatorListener);

        JPanel jPanelButtons = new JPanel();
        jPanelButtons.setLayout(new GridLayout(2,3));
        jPanelButtons.add(jButton_plus);
        jPanelButtons.add(jButton_minus);
        jPanelButtons.add(jButton_multiply);
        jPanelButtons.add(jButton_divide);
        jPanelButtons.add(jButton_pow);
        jPanelButtons.add(jButton_mod);

        this.setLayout(new BorderLayout(10, 10));
        this.add(jPanelIO, BorderLayout.CENTER);
        this.add(jPanelButtons, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void minus() {
        double firstValue = Double.valueOf(jTextField_First_Value.getText());
        double doubleValue = Double.valueOf(jTextField_Second_Value.getText());

        this.miniCalculatorModel.setFirst_Value(firstValue);
        this.miniCalculatorModel.setSecond_Value(doubleValue);
        this.miniCalculatorModel.minus();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
    public void multiply() {
        double firstValue = Double.valueOf(jTextField_First_Value.getText());
        double doubleValue = Double.valueOf(jTextField_Second_Value.getText());

        this.miniCalculatorModel.setFirst_Value(firstValue);
        this.miniCalculatorModel.setSecond_Value(doubleValue);
        this.miniCalculatorModel.multiply();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
    public void devide() {
        double firstValue = Double.valueOf(jTextField_First_Value.getText());
        double doubleValue = Double.valueOf(jTextField_Second_Value.getText());

        this.miniCalculatorModel.setFirst_Value(firstValue);
        this.miniCalculatorModel.setSecond_Value(doubleValue);
        this.miniCalculatorModel.devide();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
    public void plus() {
        double firstValue = Double.valueOf(jTextField_First_Value.getText());
        double doubleValue = Double.valueOf(jTextField_Second_Value.getText());

        this.miniCalculatorModel.setFirst_Value(firstValue);
        this.miniCalculatorModel.setSecond_Value(doubleValue);
        this.miniCalculatorModel.plus();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void pow() {
        double firstValue = Double.valueOf(jTextField_First_Value.getText());
        double doubleValue = Double.valueOf(jTextField_Second_Value.getText());

        this.miniCalculatorModel.setFirst_Value(firstValue);
        this.miniCalculatorModel.setSecond_Value(doubleValue);
        this.miniCalculatorModel.pow();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void mod() {
        double firstValue = Double.valueOf(jTextField_First_Value.getText());
        double doubleValue = Double.valueOf(jTextField_Second_Value.getText());

        this.miniCalculatorModel.setFirst_Value(firstValue);
        this.miniCalculatorModel.setSecond_Value(doubleValue);
        this.miniCalculatorModel.mod();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
}
