package javax_swings_menu.jradio_jcheckbox.service;

import javax_swings_menu.jradio_jcheckbox.view.ThucDonView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class ThucDonController implements ActionListener {
    private ThucDonView thucDonView;

    public ThucDonController(ThucDonView thucDonView) {
        this.thucDonView = thucDonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String monChinh = "";
        Enumeration<AbstractButton> button_MonChinh = thucDonView.buttonGroup_MonChinh.getElements();
        while (button_MonChinh.hasMoreElements()) {
            AbstractButton button = button_MonChinh.nextElement();
            if (button.isSelected()) {
                monChinh = button.getText();
            }
        }
        String  monPhu = "";
        for(AbstractButton button : thucDonView.list_buttonGroup_MonPhu) {
            if (button.isSelected()) {
                monPhu = monPhu + button.getText() + ";";
            }
        }

        thucDonView.thucDonModel.setLuaChon_MonChinh(monChinh);
        thucDonView.thucDonModel.setLuaChon_MonPhu(monPhu);
        thucDonView.thucDonModel.tinhTongTien();
        thucDonView.hienThiKetQua();
    }
}
