package JavaExerciseYouTube.abstractandextends;

public class Planes extends Transport{
    private String fuelType; // loại nhiên liệu

    public Planes(String carriage, Manuafacture manuafacturer, String fuelType) {
        super(carriage, manuafacturer);
        this.fuelType = fuelType;
    }

    void takeOff() { // cất cánh

    }
    void landing() { // hạ cánh

    }
    @Override
    double getSpeed() {
        return 500;
    }
}
