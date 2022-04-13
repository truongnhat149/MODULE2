package exercise_james.introduction_to_java.Comparable;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;
    public Circle() {}
    public  Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
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

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return radius*radius * Math.PI;
    }
    public String toString() {
        return "radius = " + radius
                + "Area "
                + getArea();
    }
}
