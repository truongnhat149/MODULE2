package exercise_james.abstract_and_interface.ShapeInterface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // có 1 mảng tạo ra các hình
        // với mỗi phần tử, tăng kích thước đó
        // lên ti lệ random 1- 100
        // khai báo mảng chứa các hình sau khi tăng kích thước
        Shape shapes[] = new Shape[3];
        // lúc chưa giảm
        Circle circle = new Circle(12);
        System.out.println(" Circle before " + circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(" Rectangle before " + rectangle);

        Square square = new Square(12);
        System.out.println("Square before " + square);

        // khai báo 1 biến random từ 1- 100 để set kích thước
        double percent = Math.floor(Math.random() * 100 - 1);
        // thay đổi kích thước
        circle.resize(percent);
        shapes[0] = circle;

        rectangle.resize(percent);
        shapes[1] = rectangle;

        square.resize(percent);
        shapes[2] = square;

        System.out.println("Array after resizing " + Arrays.toString(shapes));
    }
}
