package javax_swing.jscroll_pane.view;

import javax_swing.jscroll_pane.controller.TimKiemListener;
import javax_swing.jscroll_pane.model.TimKiemModel;

import javax.swing.*;
import java.awt.*;

public class TimKiemView extends JFrame {
    private TimKiemModel timKiemModel;
    private JTextArea jTextArea_vanBan;
    private JTextField jTextField_tuKhoa;
    private JLabel jLabel_ketQua;

    public TimKiemView() throws HeadlessException {
        this.timKiemModel = new TimKiemModel();
        this.init();
    }

    private void init() {
        this.setTitle("Tìm kiếm");
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 40);

        // Center
        JLabel jLabel_vanBan = new JLabel("Văn Bản");
        jLabel_vanBan.setFont(font);
        jTextArea_vanBan = new JTextArea(100, 100);
        jTextArea_vanBan.setFont(font);

        // cuộn văn bản
        JScrollPane jScrollPane = new JScrollPane(jLabel_vanBan);

        // footer
        TimKiemListener timKiemListener = new TimKiemListener(this);

        JLabel jLabel_tuKhoa = new JLabel("Từ khóa");
        jLabel_tuKhoa.setFont(font);
        jTextField_tuKhoa = new JTextField();
        jTextField_tuKhoa.setFont(font);

        JButton jButton_thongKe = new JButton("Thống kê");
        jButton_thongKe.setFont(font);
        jButton_thongKe.addActionListener(timKiemListener);
        jButton_thongKe.setBackground(Color.BLUE);
        jButton_thongKe.setBorderPainted(false);
        jButton_thongKe.setOpaque(true);

        jLabel_ketQua = new JLabel();
        jLabel_ketQua.setBackground(Color.YELLOW);
        jLabel_ketQua.setFont(font);
        jLabel_ketQua.setOpaque(true);

        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2, 2, 20, 20));
        jPanel_footer.add(jLabel_tuKhoa);
        jPanel_footer.add(jTextField_tuKhoa);
        jPanel_footer.add(jButton_thongKe);
        jPanel_footer.add(jLabel_ketQua);

        this.setLayout(new BorderLayout());
        this.add(jLabel_vanBan, BorderLayout.NORTH);
        this.add(jScrollPane, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);
        this.setVisible(true);
    }
    public void timKiem() {
        this.timKiemModel.setDocument(jTextArea_vanBan.getText());
        this.timKiemModel.setKey(jTextField_tuKhoa.getText());
        this.timKiemModel.timKiem();
        this.jLabel_ketQua.setText(this.timKiemModel.getResult());
    }
}
