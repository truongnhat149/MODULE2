package exercise_james.inheritance.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Triangle triangle = new Triangle(3, 4, 7);
        System.out.println(triangle);
    }
}
