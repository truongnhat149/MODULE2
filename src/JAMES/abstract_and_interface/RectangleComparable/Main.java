package exercise_james.abstract_and_interface.RectangleComparable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangles[] = new Rectangle[3];
        rectangles[0] = new Rectangle(12, 24, true, "blue");
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(24, 56);

        System.out.println("Pre- sorted");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);

        System.out.println(" After = sorted");

        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
