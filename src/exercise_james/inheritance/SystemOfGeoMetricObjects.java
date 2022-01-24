package exercise_james.inheritance;

public class SystemOfGeoMetricObjects {
    public static void main(String[] args) {
        // kiểm thử shape
//        Shape shape = new Shape("red", false);
//        System.out.println(shape);

        // kiểm thử class circle
//        Circle circle = new Circle();
//        System.out.println(circle);
//        Circle circle = new Circle(3.5);
//        System.out.println(circle);
//        Circle circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);

        // kiểm thử rectangle

//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//        Rectangle rectangle = new Rectangle(2.8 , 5);
//        System.out.println(rectangle);
//        Rectangle rectangle = new Rectangle(3 , 5.4, "black", true);
//        System.out.println(rectangle);

        // kiểm thử square

//        Square square = new Square();
//        System.out.println(square);
//        Square square = new Square(2.3);
//        System.out.println(square);
//        Square square = new Square(5.8, "yellow", true);
//        System.out.println(square);
    }
    public static class Shape {
        private String color = "red";
        private boolean filled = true;

        public Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public Shape() {

        }

        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public boolean isFilled() {
            return filled;
        }
        public void  setFilled(boolean filled) {
            this.filled = filled;
        }
        @Override
        public String toString() {
            return "A Shape with color of"
                    + getColor()
                    + "and"
                    + (isFilled() ? "filled" : "not filled");
        }
    }
    public static class Circle extends Shape {
        private double radius = 1.0;

        public Circle() {
        }
        public Circle(double radius) {
            this.radius = radius;
        }
        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }
        public double getRadius() {
            return radius;
        }
        public void setRarius(double radius) {
            this.radius = radius;
        }
        public double getArea() {
            return Math.PI * this.radius * this.radius;
        }
        public double getPerimeter() {
            return Math.PI * this.radius * 2;
        }
        @Override
        public String toString() {
            return "A circle with "
                    + getRadius()
                    + ", which is subclass of "
                    + super.toString();
        }
    }
    public static class Rectangle extends Shape {
        private double width = 1.0;
        private double length = 1.0;

        public Rectangle() {

        }
        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }
        public Rectangle(double width, double length, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return width;
        }
        public void setWidth(double width) {
            this.width = width;
        }
        public double getLength() {
            return length;
        }
        public void setLength(double length) {
            this.length = length;
        }
        public double getArea() {
            return this.width * this.length;
        }
        public double getPerimeter() {
            return (width + length) * 2;
        }
        @Override
        public String toString() {
            return "A Rectangle width"
                    + getWidth()
                    + " and length " + getLength()
                    + " which is a subclass of "
                    + super.toString();
        }
    }
    public static class Square extends Rectangle {
        public Square() {

        }
        public Square(double side) {
            super(side, side);
        }
        public Square(double side, String color, boolean filled) {
            super(side, side, color, filled);
        }
        public double getSide() {
            return getWidth();
        }
        public void setSide(double side) {
            setWidth(side);
            setLength(side);
        }
        @Override
        public void setWidth(double width) {
            setSide(width);
        }
        public void setLength(double length) {
            setSide(length);
        }
        public String toString() {
            return "A Square with side = "
                   + getSide()
                   + ", which is a subclass of "
                   + super.toString();
        }
    }
}
