package javax_swings_menu.tick_chon.service;

import javax_swings_menu.tick_chon.view.MenuExampleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuExampleMouseListener implements MouseListener {
    MenuExampleView menuExampleView;

    public MenuExampleMouseListener(MenuExampleView menuExampleView) {
        this.menuExampleView = menuExampleView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.isPopupTrigger()) {
            this.menuExampleView.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
