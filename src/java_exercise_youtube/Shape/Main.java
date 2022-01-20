package java_exercise_youtube.Shape;

public class Main {
    public static void main(String[] args) {
        Coordinates coordinates = new Coordinates(35, 24);
        Coordinates coordinates2 = new Coordinates(3, 44);
        Coordinates coordinates3 = new Coordinates(57, 90);

        Circle circle = new Circle(coordinates, 5);
        Circle circle2 = new Circle(coordinates2, 25);
        Circle circle3 = new Circle(coordinates3, 10);

        Rectangle rectangle = new Rectangle(coordinates, 24, 45);
        Rectangle rectangle2 = new Rectangle(coordinates2, 80, 25);
        Rectangle rectangle3 = new Rectangle(coordinates3, 25, 56);

        System.out.println(circle);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println(rectangle);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
    }
}
