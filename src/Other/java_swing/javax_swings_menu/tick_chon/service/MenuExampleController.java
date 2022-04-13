package javax_swings_menu.tick_chon.service;

import javax_swings_menu.tick_chon.view.MenuExampleView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExampleController implements ActionListener {
    private MenuExampleView menuExampleView;

    public MenuExampleController(MenuExampleView menuExampleView) {
        this.menuExampleView = menuExampleView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("Exit")) {
            System.exit(0);
        } else if (button.equals("Toolbar")) {
            System.out.println("Toolbar");
            AbstractButton checkBox = (AbstractButton) e.getSource();
            boolean check = checkBox.getModel().isSelected();

            if (check) {
                System.out.println("check");
                this.menuExampleView.enableToolBar();
            } else {
                System.out.println("unCheck");
                this.menuExampleView.disableToolBar();
            }
        } else
            this.menuExampleView.setTextJLabel("Bạn đã click" + button);
    }
}
