package java_exercise_youtube.abstractandextends;

public class Car extends Transport{
    private String fuelType; // loại nhiên liệu

    public Car(String carriage, Manuafacture manuafacturer, String fuelType) {
        super(carriage, manuafacturer);
        this.fuelType = fuelType;
    }

    @Override
    double getSpeed() {
        return 0;
    }
}
