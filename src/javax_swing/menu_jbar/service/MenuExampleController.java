package javax_swing.menu_jbar.service;

import javax_swing.menu_jbar.view.MenuExampleView;

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

    if(button.equals("Open")) {
        this.menuExampleView.setTextJLabel("Click JmenuItem Open");
    } else if (button.equals("Exit")) {
//        this.menuExampleView.setTextJLabel("Click Jmenuitem Exit");
        System.exit(0);
    } else if (button.equals("Welcome")){
        this.menuExampleView.setTextJLabel("Clcik Jmenuitem Welcome");
    }
    }
}
