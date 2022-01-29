package javax_swings_menu.create_click_right.test;

import javax_swings_menu.create_click_right.view.MenuView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MenuView();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
