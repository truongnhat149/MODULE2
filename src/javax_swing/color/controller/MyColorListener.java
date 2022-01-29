package javax_swing.color.controller;

import javax_swing.color.view.MyColorView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorListener implements ActionListener {

    private MyColorView myColorView;

    public MyColorListener(MyColorView myColorView) {
        this.myColorView = myColorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String scr = e.getActionCommand();
        if (scr.equals("Red Text")) {
            this.myColorView.changeTextColor(Color.RED);
        } else if (scr.equals("Yellow Text")){
            this.myColorView.changeTextColor(Color.YELLOW);
        } else if (scr.equals("Green Text")) {
            this.myColorView.changeTextColor(Color.GREEN);
        } else if (scr.equals("Red Background")) {
            this.myColorView.changeBackground(Color.RED);
        } else if (scr.equals("Yellow Background")) {
            this.myColorView.changeBackground(Color.YELLOW);
        } else {
            this.myColorView.changeBackground(Color.GREEN);
        }
    }
}
