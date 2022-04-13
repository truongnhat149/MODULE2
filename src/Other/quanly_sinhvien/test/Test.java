package quanly_sinhvien.test;

import quanly_sinhvien.view.QLSVView;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new QLSVView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
