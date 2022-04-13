package javax_swing.jtext_area.view;

import javax_swing.jtext_area.controller.FindListener;
import javax_swing.jtext_area.model.FindModel;

import javax.swing.*;
import java.awt.*;

public class FindView extends JFrame {
    private FindModel findModel;
    private JTextArea jTextArea_document;
    private JTextField jTextField_key;
    private JLabel jLabel_result;

    public FindView() throws HeadlessException {
        this.findModel = new FindModel();
        this.init();
    }

    public void init() {
        this.setTitle("Find");
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 40);

        // Center
        JLabel jLabel_document = new JLabel("Văn bản");
        jLabel_document.setFont(font);
        jTextArea_document = new JTextArea(100, 100);
        jTextArea_document.setFont(font);

        //footer

        FindListener findListener = new FindListener(this);

        JLabel jLabel_key = new JLabel("Từ Khóa");
        jLabel_key.setFont(font);
        jTextField_key = new JTextField();
        jTextField_key.setFont(font);

        JButton jButton_staticstical = new JButton("Thống kê");
        jButton_staticstical.setFont(font);
        jButton_staticstical.addActionListener(findListener);
        jButton_staticstical.setBackground(Color.BLUE);
//        jButton_staticstical.setBorderPainted(false);
        jButton_staticstical.setOpaque(true);
        jLabel_result = new JLabel();
        jLabel_result.setBackground(Color.YELLOW);
        jLabel_result.setFont(font);
        jLabel_result.setOpaque(true);

        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2, 2, 20, 20));
        jPanel_footer.add(jLabel_key);
        jPanel_footer.add(jTextField_key);
        jPanel_footer.add(jButton_staticstical);
        jPanel_footer.add(jLabel_result);

        this.setLayout(new BorderLayout());
        this.add(jLabel_document, BorderLayout.NORTH);
        this.add(jTextArea_document, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void finding() {
        this.findModel.setDocument(jTextArea_document.getText());
        this.findModel.setKey(jTextField_key.getText());
        this.findModel.finding();
        this.jLabel_result.setText(this.findModel.getResult());
    }
}
