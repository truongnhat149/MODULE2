package exercise_james.searching_algorithm.jame_slide;


import java.util.Scanner;

public class LinearSeaach {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,2,1,0,5,1,4,66,52,2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number find");
        int value = sc.nextInt();

        linearSearch(arr,value);
        System.out.println("value found" + value);
    }
    public static int linearSearch(int[] arr, int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                index = i;
                break;
            }
            System.out.println("value found is index in array " +  arr[i]);
        }
        return index;
    }
}
