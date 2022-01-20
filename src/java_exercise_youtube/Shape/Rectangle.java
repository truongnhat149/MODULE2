package java_exercise_youtube.Shape;

public class Rectangle extends Shape{
    private double length, height;

    public Rectangle(Coordinates coordinates, double length, double height) {
        super(coordinates);
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return length*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", height=" + height + "area "+getArea() +
                '}';
    }
}
