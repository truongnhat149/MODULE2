package javax_swings_menu.tick_chon.view;

import javax_swings_menu.tick_chon.service.MenuExampleController;
import javax_swings_menu.tick_chon.service.MenuExampleMouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MenuExampleView extends JFrame {
    private JLabel jLabel;
    public JPopupMenu jPopupMenu;
    private JToolBar jToolBar;

    public MenuExampleView() {
        this.setTitle("Menu Example");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        // tạo controller
        MenuExampleController menuExampleController = new MenuExampleController(this);

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

        JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
        jMenuItem_open.addActionListener(menuExampleController);
        jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_DOWN_MASK));

        JMenuItem jMenuItem_exit = new JMenuItem("New", KeyEvent.VK_X);
        jMenuItem_exit.addActionListener(menuExampleController);
        jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));

        jMenu_file.add(jMenuItem_new);
        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);

        // menu view

        JMenu jMenu_view = new JMenu("View");
        JCheckBoxMenuItem jCheckBoxMenuItem_toolbar = new JCheckBoxMenuItem("Toll bar");
        jCheckBoxMenuItem_toolbar.addActionListener(menuExampleController);
        jMenu_view.add(jCheckBoxMenuItem_toolbar);

        // menu help

        JMenu jMenu_help = new JMenu("Help");
        jMenu_help.setMnemonic(KeyEvent.VK_L);
        jMenu_help.setDisplayedMnemonicIndex(0);

        JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
        jMenuItem_welcome.addActionListener(menuExampleController);
        jMenu_help.add(jMenuItem_welcome);

        // add jMEnu
        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_help);
        jMenuBar.add(jMenu_view);

        // thêm thanh menu vào chương trình
        this.setJMenuBar(jMenuBar);

        // tạo tool bar
        jToolBar = new JToolBar();
        JButton jButton_Undo = new JButton("Undo");
        jButton_Undo.setToolTipText("Nhấn vào đây để quay lại");
        jButton_Undo.addActionListener(menuExampleController);

        JButton jButton_Redo = new JButton("Redo");
        jButton_Undo.addActionListener(menuExampleController);

        JButton jButton_Copy = new JButton("Copy");
        jButton_Undo.addActionListener(menuExampleController);

        JButton jButton_Cut = new JButton("Cut");
        jButton_Undo.addActionListener(menuExampleController);

        JButton jButton_Paste = new JButton("Paste");
        jButton_Undo.addActionListener(menuExampleController);

        jToolBar.add(jButton_Undo);
        jToolBar.add(jButton_Redo);
        jToolBar.add(jButton_Copy);
        jToolBar.add(jButton_Cut);
        jToolBar.add(jButton_Paste);

        // menu chuột phải Popup menu
        jPopupMenu = new JPopupMenu();

        JMenu jMenuPopupFont = new JMenu("Font");
        JMenuItem jMenuItemType = new JMenuItem("Type");
        jMenuItemType.addActionListener(menuExampleController);

        JMenuItem jMenuItemSize = new JMenuItem("Size");
        jMenuItemSize.addActionListener(menuExampleController);

        jMenuPopupFont.add(jMenuItemType);
        jMenuPopupFont.add(jMenuItemSize);

        JMenuItem jMenuItemCut = new JMenuItem("Cut");
        jMenuItemCut.addActionListener(menuExampleController);

        JMenuItem jMenuItemCopy = new JMenuItem("Copy");
        jMenuItemCut.addActionListener(menuExampleController);

        JMenuItem jMenuItemPaste = new JMenuItem("Paste");
        jMenuItemCut.addActionListener(menuExampleController);

        jPopupMenu.add(jMenuPopupFont);
        jPopupMenu.addSeparator();
        jPopupMenu.add(jMenuItemCut);
        jPopupMenu.add(jMenuItemCopy);
        jPopupMenu.add(jMenuItemPaste);

        this.add(jPopupMenu);

        // thêm sự kiện phải chuột vào JLabel
        MenuExampleMouseListener menuExampleMouseListener = new MenuExampleMouseListener(this);
        this.addMouseListener(menuExampleMouseListener);

        //Tạo Label hiển thị
        Font font = new Font("Arial", Font.BOLD, 50);
        jLabel = new JLabel();

        this.add(jLabel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void setTextJLabel(String s) {
        this.jLabel.setText(s);
    }

    public void enableToolBar() {
        this.add(jToolBar, BorderLayout.NORTH);
        this.refresh();
    }

    public void disableToolBar() {
        this.remove(jToolBar);
        this.refresh();
    }

    public void refresh() {
        this.pack();
        this.setSize(500, 500);
    }
}
