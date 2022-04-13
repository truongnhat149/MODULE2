package javax_swing.jscroll_pane.controller;

import javax_swing.jscroll_pane.view.TimKiemView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimKiemListener implements ActionListener {
    private TimKiemView timKiemView;
    public TimKiemListener(TimKiemView timKiemView) {
        this.timKiemView = timKiemView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.timKiemView.timKiem();
    }
}
