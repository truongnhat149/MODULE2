package javax_swings_menu.thong_bao.service;


import javax_swings_menu.thong_bao.view.ThucDonView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThucDonController implements ActionListener {
    private ThucDonView thucDonView;

    public ThucDonController() {
        this.thucDonView = thucDonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String monChinh = thucDonView.jComboBox_MonChinh.getSelectedItem().toString();

        String monPhu = "";
        Object[] luaChonMonPhus = thucDonView.jList_MonPhu.getSelectedValues();
        for (Object o : luaChonMonPhus) {
            monPhu = monPhu + o.toString() + "; ";
        }

        thucDonView.thucDonModel.setLuaChon_MonChinh(monChinh);
        thucDonView.thucDonModel.setLuaChon_MonPhu(monPhu);
        thucDonView.thucDonModel.tinhTongTien();
        thucDonView.hienThiKetQua();

        String soTien_Chuoi = (String) JOptionPane.showInputDialog(
                thucDonView,
                thucDonView.jLabel_ThongTin.getText()
                        + "\nNhập vào số tiền:",
                "Thông báo",
                JOptionPane.PLAIN_MESSAGE);

        try {
            double soTien = Double.valueOf(soTien_Chuoi);
            JOptionPane.showMessageDialog(thucDonView,
                    "Thối tiền lại cho khách: "+(soTien - thucDonView.thucDonModel.getTongTien()),
                    "Infor",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e2) {
            JOptionPane.showMessageDialog(thucDonView,
                    "Nhập dữ liệu sai!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
