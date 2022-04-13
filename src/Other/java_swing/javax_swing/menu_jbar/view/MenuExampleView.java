package javax_swing.menu_jbar.view;

import javax_swing.menu_jbar.service.MenuExampleController;

import javax.swing.*;
import java.awt.*;

public class MenuExampleView extends JFrame {
    private JLabel jLabel;

    public MenuExampleView() {
        this.setTitle("Menu Example");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // tạo controller
        MenuExampleController menuExampleController = new MenuExampleController(this);

        // tạo thanh menu
        JMenuBar jMenuBar = new JMenuBar();

        //tạo 1 menu
        JMenu jMenu_file = new JMenu("File");

        // tạo menu con

        JMenuItem jMenuItem_open = new JMenuItem("Open");
        jMenuItem_open.addActionListener(menuExampleController);

        JMenuItem jMenuItem_exit = new JMenuItem("Exit");
        jMenuItem_exit.addActionListener(menuExampleController);

        jMenu_file.add(jMenuItem_open);
        // ngăn cách
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);

        // tạo menu
        JMenu jMenu_help = new JMenu("Help");
        JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
        jMenuItem_welcome.addActionListener(menuExampleController);
        jMenu_help.add(jMenuItem_welcome);

        // add vào menu
        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_help);

        // thêm thanh menu vào chương trình
        this.setJMenuBar(jMenuBar);

        // tạo label hiển thị
        Font font = new Font("Arial", Font.BOLD,50);
        jLabel = new JLabel();

        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void setTextJLabel(String s) {
        this.jLabel.setText(s);
    }
}
