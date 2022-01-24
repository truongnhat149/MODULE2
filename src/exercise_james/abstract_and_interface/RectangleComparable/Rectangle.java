package exercise_james.abstract_and_interface.RectangleComparable;

public class Rectangle {
    protected double width,height;
    protected String color;
    private boolean filled;
    public Rectangle() {

    }
    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }
    public Rectangle(double width, double height, boolean filled, String color) {
        this.width = width;
        this.height = height;
        this.filled = filled;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                " area " + getArea() +
                '}';
    }
}
