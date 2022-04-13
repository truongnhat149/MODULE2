package javax_swing.jframe;

import javax.swing.*;

public class MyWindows extends JFrame {
    public MyWindows() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void showWindowss() {
        this.setVisible(true);
    }

    public void showWindowss(String title) {
        this.setTitle(title);
        this.setVisible(true);
    }

    public void showWindowss(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyWindows myWindows1 = new MyWindows();
        MyWindows myWindows2 = new MyWindows();
        MyWindows myWindows3 = new MyWindows();
        myWindows1.showWindowss("window 1");
        myWindows2.showWindowss("window 2", 400, 200);
        myWindows3.showWindowss("window 3", 700, 400);
    }
}
