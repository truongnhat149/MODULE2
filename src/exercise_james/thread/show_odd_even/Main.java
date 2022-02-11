package exercise_james.thread.show_odd_even;

public class Main {
    public static void main(String[] args) {
        OddThread numOdd = new OddThread();
        EvenThread numEven = new EvenThread();
        numOdd.start();
        numEven.start();
        try {
            // chạy trước 175ms
            numOdd.join(175);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
