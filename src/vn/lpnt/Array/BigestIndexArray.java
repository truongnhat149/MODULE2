package vn.lpnt.Array;
import java.util.Scanner;


public class BigestIndexArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the net worth of billionaires : ");
        int size;

        do {
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Please enter 20 number ");
            }
        } while (size > 20);


        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
//            System.out.println("Billionaires number:" + (i + 1));
            System.out.println("Billionaires number: " + (i + 1) + " ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Property list: ");
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
//        }
//        for (int j : array) {
//            System.out.print(array[j] + "");
//        }
        int max = array[0];
        // khởi tạo biến index gán giá trị bằng 1, vì vị trí ở đây chính là bảng xếp hạng
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest propety value in the list : " + max + " in position " + index);
    }

}
