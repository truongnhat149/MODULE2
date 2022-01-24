package exercise_james.array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 20; // size tùy ý/ đây là sức chứa của mảng
        int[] arr = new int[size];
        arr[0] = 6;
        arr[1] = 3;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;
        arr[5] = 5;
        arr[6] = 3;
        arr[7] = 6;
        int n = 8; //số phần tử trong mảng

        System.out.println("trước khi xóa: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("Enter number you want remove: ");
        int number = scanner.nextInt();
        n = deleteElement(arr, n, number);

        System.out.println("Sau khi xóa");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int deleteElement(int[] arr, int n, int key) {
        int pos = serachElement(arr, key);
            if (pos == -1) {
                System.out.println("Không tìm thấy ");
            }

        // xóa phần tử trong mảng
        for (int i = pos; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }
    public static int serachElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    static int m(int...x) {
        int b = 0;
        for(int a:x){
            b+=a;
        }
        return b;
    }
}