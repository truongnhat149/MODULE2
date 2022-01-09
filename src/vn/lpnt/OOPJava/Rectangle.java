package vn.lpnt.OOPJava;
import java.util.*;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width");
        double width = scanner.nextDouble();
        System.out.println("Enter heigth");
        double height = scanner.nextDouble();
        DrawRectangle rectangle1 = new DrawRectangle(width, height);
        System.out.println("Show rectengle " + rectangle1.display());
        System.out.println("Area rectangle " + rectangle1.getArea());
        System.out.println("Perimeter " + rectangle1.getPerimeter());
    }

    public static class DrawRectangle {
        double width, heigth;

        public DrawRectangle(double width, double heigth) {
            this.width = width;
            this.heigth = heigth;
        }
        public double getArea() {
            return this.width * this.heigth;
        }
        public double getPerimeter() {
            return (this.width + this.heigth) * 2;
        }
        public String display() {
            return "Width =" + width + "Height =" + heigth;
        }
    }
}
