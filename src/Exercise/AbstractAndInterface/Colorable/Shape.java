package Exercise.AbstractAndInterface.Colorable;

public class Shape {
    protected String color = " black ";
    protected boolean filled = true;

    public Shape() {}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }
    public double getArea() {
        return 0;
    }
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + (isFilled() ? "filled" : "not filled") +
                '}';
    }
}
