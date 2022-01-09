package vn.lpnt.AccessStaticMethod;

public class AcessModifier {
    public static void main(String[] args) {
    Circle c1 = new Circle(2);
        System.out.println("the area of the circle is : " + c1.getArea());
    }
    public static class Circle {
        private double radius = 1.0;
        private String color = "red";

        public Circle() {}
        public  Circle(double r) {
            this.radius = r;
        }
        public double getRadius() {
            return this.radius * this.radius;
        }
        public double getArea() {
            return getRadius() * 3.14;
        }
    }
}
