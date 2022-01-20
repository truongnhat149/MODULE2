package java_exercise_youtube.other;

public class TestEquals {
    public static void main(String[] args) {

        Equals equals = new Equals(14, 12);
        System.out.println(equals);
        Equals equals2 = new Equals(14, 12);
        System.out.println(equals2);
        System.out.println(equals.equals(equals2));
        equals.hashCode();
        equals2.hashCode();
        if (equals.hashCode() == equals2.hashCode()) {
            System.out.println("OK");
        } else {
            System.out.println("NO");
        }
    }
}
