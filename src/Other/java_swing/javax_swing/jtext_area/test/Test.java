package javax_swing.jtext_area.test;

import javax_swing.jtext_area.view.FindView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new FindView();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
