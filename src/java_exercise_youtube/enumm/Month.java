package java_exercise_youtube.enumm;

public enum Month {
    Month_1(31),
    Month_2(28),
    Month_3(31),
    Month_4(30),
    Month_5(31),
    Month_6(30),
    Month_7(31),
    Month_8(31),
    Month_9(30),
    Month_10(31),
    Month_11(30),
    Month_12(31);

    private final  int numberOfDays;
    Month(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public  int numberOfDays() {
        return this.numberOfDays;
    }
}
