package java_exercise_youtube.abstractandextends;

public class Bike extends Transport{

    public Bike(String carriage, Manuafacture manuafacturer) {
        super(carriage, manuafacturer);
    }

    @Override
    double getSpeed() {
        return 0;
    }
}
