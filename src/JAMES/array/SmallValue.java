package exercise_james.array;
import java.util.Scanner;

public class SmallValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[] = {1,2,3,4,5,-2,-8,9,10,20,23,44,31};
        int index = minValueArray(array);
        System.out.println("The smallest in the array is : " + array[index] + " is position : " + index);
    }
    public static int minValueArray(int arrs[]) {
        int index = 0;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] < arrs[0]) {
                index = i;
            }
        }
        return index;
    }
}
