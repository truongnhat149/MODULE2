package javax_swings_menu.jcombobox_jlist.service;



import javax_swings_menu.thong_bao.view.ThucDonView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThucDonController implements ActionListener {
    private ThucDonView thucDonView;

    public ThucDonController(ThucDonView thucDonView) {
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
    }

}
