package javax_swings_menu.create_click_right.service;

import javax_swings_menu.create_click_right.view.MenuView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {
    private MenuView menuView;
    public MenuController(MenuView menuView) {
        this.menuView = menuView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();

        if (button.equals("Exit")) {
            System.exit(0);
        } else
            this.menuView.setTextJLabel("Bạn đã click" + button);
    }
}
