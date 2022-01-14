package Exercise.AbstractAndInterface.Colorable;

public class Square extends Shape implements Colorable{
    private double side;

    public Square() {}
    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + side +
                " Area " + getArea()
                + " Perimeter " + getPerimeter() +
                '}';
    }

    @Override
    public void howtoColor() {
        System.out.println("Color all four sides");
    }
}
