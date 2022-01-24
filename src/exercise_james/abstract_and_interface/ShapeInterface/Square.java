package exercise_james.abstract_and_interface.ShapeInterface;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public Square() {

    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "area square" + getArea() +
                super.toString() +
                '}';
    }

    @Override
    public void resize(double x) {
         this.side = Math.random() * 100 + (this.side * x )- 1;
    }
}
