package JavaExerciseYouTube.generic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box box = new Box<Integer>(15);
        System.out.println("Giá trị: " + box.getValue());

        Box box2 = new Box<String>("Nhat Truong");
        System.out.println("Giá trị: " + box2.getValue());

        Box box3 = new Box<Float>(15.6f);
        System.out.println("Giá trị: " + box3.getValue());

        Box box4 = new Box<Double>(55.6d);
        System.out.println("Giá trị: " + box4.getValue());
    }
}
