package vn.lpnt.Array;
import java.util.*;

public class CountTheNumberApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        int count = 0;
        // check size
        do {
            size = scanner.nextInt();
            if (size > 3) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 3);
        // input arrs
        int arr[] = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter a mark for student " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int show = countElement(arr, count);
        System.out.println("Number of student who passed : " + show);
    }
    public static int countElement(int arr[],int count) {
        count = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] <= 10) {
                count++;
            }
        }
        return count;
    }
}
