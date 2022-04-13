package exercise_james.access_static_method;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    public String getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }
}