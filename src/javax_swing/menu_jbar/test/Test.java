package javax_swing.menu_jbar.test;

import javax_swing.menu_jbar.view.MenuExampleView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MenuExampleView();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
