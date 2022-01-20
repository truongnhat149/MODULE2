package Exercise.array;
import java.util.*;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        int arr[] = new int[size];
//        int numbers = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min in array " + min);
    }
}
