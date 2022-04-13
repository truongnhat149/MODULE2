package exercise_james.thread.racing_cars;

public class Main {
    public static final int DISTANCE = 100;
    public static final int STEP = 2;

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread t1 = new Thread(carA);
        Thread t2 = new Thread(carB);
        Thread t3 = new Thread(carC);

        System.out.println("Distance : 100km");
        t1.start();
        t2.start();
        t3.start();
    }
}
