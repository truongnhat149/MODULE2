package exercise_james.inheritance.Shape;

public class Shape {
    private double side;
    public Shape(){}
    public Shape(double side) {
        this.side = side;
    }
    public String toString() {
        return "side= " + side;
    }
}
