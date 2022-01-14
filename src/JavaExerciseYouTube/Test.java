package JavaExerciseYouTube;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[255];
        // code here
        int size = 255;
        int sum = 0;
        for (int i = 1; i <= size; i++) sum += arr[i];
        System.out.println(sum);
    }
}
