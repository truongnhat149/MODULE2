package javax_swing.font_layout.controller;

import javax_swing.font_layout.view.LastButtonView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastButtonListener implements ActionListener {
    private LastButtonView lastButtonView;
    public LastButtonListener(LastButtonView lastButtonView) {
        this.lastButtonView = lastButtonView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String nguonSuKien = e.getActionCommand();
        if(nguonSuKien.equals("1")) {
            this.lastButtonView.changeToo_1();
        } else if (nguonSuKien.equals("2")) {
            this.lastButtonView.changeToo_2();
        } else if (nguonSuKien.equals("3")) {
            this.lastButtonView.changeToo_3();
        } else
            this.lastButtonView.changeToo_4();

    }
}
