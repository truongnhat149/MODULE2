package vn.lpnt.Array;
import java.util.*;

public class ArraySumDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nhập vào ma trận vuông
        int min = 5;
        int max = 8;
        // nhập độ dài mảng bạn muốn
        System.out.println("Enter the array length you want : ");
        int size = scanner.nextInt();
        int arr[][] = new int[size][size];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
                arr[i][j] = random;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // tổng đường chéo chính
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of main diagonals : " + sum);
    }
}
