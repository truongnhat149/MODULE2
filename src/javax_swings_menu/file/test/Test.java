package javax_swings_menu.file.test;

import javax_swings_menu.file.view.MyNotepadView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MyNotepadView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
