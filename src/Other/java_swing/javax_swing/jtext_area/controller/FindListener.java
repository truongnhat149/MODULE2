package javax_swing.jtext_area.controller;

import javax_swing.jtext_area.view.FindView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindListener implements ActionListener {
    private FindView findView;

    public FindListener(FindView findView) {
        this.findView = findView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.findView.finding();
    }
}
