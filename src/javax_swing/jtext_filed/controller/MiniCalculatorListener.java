package javax_swing.jtext_filed.controller;

import javax_swing.jtext_filed.view.MiniCalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculatorListener implements ActionListener {
    private MiniCalculatorView miniCalculatorView;

    public MiniCalculatorListener(MiniCalculatorView miniCalculatorView) {
        this.miniCalculatorView = miniCalculatorView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("+")) {
            this.miniCalculatorView.plus();
        } else if (button.equals("-")) {
            this.miniCalculatorView.minus();
        } else if (button.equals("*")) {
            this.miniCalculatorView.multiply();
        } else if (button.equals("/")) {
            this.miniCalculatorView.devide();
        } else if (button.equals("^")) {
            this.miniCalculatorView.pow();
        } else if (button.equals("%")) {
            this.miniCalculatorView.mod();
        }
    }
}
