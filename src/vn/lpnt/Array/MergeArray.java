package vn.lpnt.Array;
import java.util.*;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list1 = new int[4];
        int[] list2 = new int[4];
        // sử dụng vòng lặp nhập các giá trị cho các phần tử trong mảng
        System.out.print("Enter input value into array 1 : ");
        for (int i = 0; i < list1.length; i++) {
            list1[i] = scanner.nextInt();
        }
        System.out.print("Enter input value into array 2 : ");
        for (int i = 0; i < list2.length; i++) {
            list2[i] = scanner.nextInt();
        }
       int i = list1.length + list2.length;
       int[] arr = new int[i];
       int count = 0;
       // duyệt mảng 1 để + vào mảng 3
       for (int j = 0; j < list1.length; j++) {
           arr[j] = list1[j];
           count++;
       }
        for (int j = 0; j < list2.length; j++) {
            arr[count++] = list2[j];
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

}
