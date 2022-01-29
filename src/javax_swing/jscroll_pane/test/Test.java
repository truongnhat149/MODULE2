package javax_swing.jscroll_pane.test;

import javax_swing.jscroll_pane.view.TimKiemView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new TimKiemView();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
