package javax_swing.create_toolbars.view;

import javax_swing.create_toolbars.service.MenuExampleController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MenuExampleView extends JFrame {
    private JLabel jLabel;

    public MenuExampleView() {
        this.setTitle("Menu Example");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        // tạo controller
        MenuExampleController menuExampleController = new MenuExampleController();

        // tạo thanh menu
        JMenuBar jMenuBar = new JMenuBar();

        // tạo 1 menu
        JMenu jMenu_file = new JMenu("File");
        jMenu_file.setMnemonic(KeyEvent.VK_F);
        jMenu_file.setDisplayedMnemonicIndex(0);

        // tạo các menu con
        JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
        jMenuItem_new.addActionListener(menuExampleController);
        jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));

        JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_N);
        jMenuItem_new.addActionListener(menuExampleController);
        jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));

        JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_N);
        jMenuItem_new.addActionListener(menuExampleController);
        jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
    }
}
