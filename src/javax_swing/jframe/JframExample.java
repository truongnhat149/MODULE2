package javax_swing.jframe;

import javax.swing.*;

public class JframExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("Vi Du ve Jfram");

        // gắng kích cữ
        jFrame.setSize(500, 300);

        // thoát khỏi chương trình
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // hiển thị
        jFrame.setVisible(true);
    }
}
