package JavaExerciseYouTube.Java56;

import java.util.Arrays;

public class Test {
    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >=0; i--) {
            result[index] = arr[i];
            index++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = new int[] {4,6,7,2,1-4,9,10,91, 98};
        int[] b = new int[10];

        System.out.println("arr before work " +Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("arr after work " + Arrays.toString(a));

        // phương thức tìm kiếm
        System.out.println("The number to look for in place " + Arrays.binarySearch(a, 98)); // return index
        System.out.println("The number to look for in place " + Arrays.binarySearch(a , -5));

        // phương thức/ hàm điền giá trị value filling method (fill) điền
        Arrays.fill(b, 2000);
        System.out.println("array after filling in value : " + Arrays.toString(b));

        // Array after sorting in descending order
        Arrays.sort(a);
        a = Test.reverse(a);
        System.out.println("Array after sorting in descending order : " +Arrays.toString(a));
    }
}
