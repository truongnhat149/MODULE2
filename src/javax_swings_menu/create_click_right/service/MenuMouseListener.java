package javax_swings_menu.create_click_right.service;

import javax_swings_menu.create_click_right.view.MenuView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuMouseListener implements MouseListener {
   MenuView menuView;

   public MenuMouseListener(MenuView menuView) {
        this.menuView = menuView;
   }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.isPopupTrigger()) {
            this.menuView.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
            this.menuView.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
