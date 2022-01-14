package JavaExerciseYouTube.Shape;

public abstract class Shape {
    private int x,y;
    protected Coordinates coordinates;

    public Shape(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public abstract double getArea();
    public abstract String toString();
}
