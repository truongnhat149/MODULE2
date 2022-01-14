package JavaExerciseYouTube.Shape;

public class Point extends Shape{
    public Point(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "area " + getArea();
    }
}
