package vn.lpnt.inheritance;

public class CircleAndCylinder {
    public static void main(String[] args) {

//        test thử circle
//        Circle circle = new Circle(3, "black");
//        System.out.println(circle);

        // test thử cylinder\
        Cylinder cylinder = new Cylinder(3, 4, "orange");
        System.out.println(cylinder);
    }

    public static class Circle {
        double radius;
        private String color;
        public Circle() {

        }
        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }
        public double getRadius() {
            return this.radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        public String getColor() {
            return this.color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public double getArea() {
            return Math.pow(getRadius(), 2) * Math.PI;
        }
        public double getPerimeter() {
            return getRadius() * 2 * Math.PI;
        }
        public String toString() {
            return "Circle is radius = "
                    + getArea()
                    + " color is : "
                    + getColor();
        }
    }
    public static class Cylinder extends Circle {
        private double height;

        public Cylinder() {
        }
        public Cylinder(double radius, double height, String color) {
            super(radius, color);
            this.height = height;
        }
        public double getHeight() {
            return this.height;
        }
        public void setHeight(double height) {
            this.height = height;
        }
        public double getVolume() {
            return radius * Math.PI * height;
        }
        public String toString() {
            return "Cylinder has radius = "
                    + getRadius()
                    + " volume = "
                    + getVolume() + " color and area "
                    + super.toString();
        }
    }
}
