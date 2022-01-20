package java_exercise_youtube.casting;

public class Casting {
    public static void main(String[] args) {
        int a = 3;
        float b;
        b  = a;
        System.out.println("a " + a + " b " + b);

        double c = 3;
        byte d = (byte) c;
        System.out.println("c" + c + "d " + d);
    }
}
