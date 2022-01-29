package javax_swings_menu.thong_bao.test;

import javax_swings_menu.jcombobox_jlist.view.ThucDonView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new ThucDonView();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
