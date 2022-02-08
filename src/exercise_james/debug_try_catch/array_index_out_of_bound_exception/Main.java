package exercise_james.debug_try_catch.array_index_out_of_bound_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
//        try {
//            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
//        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
//            System.err.println("Chỉ số vượt quá giới hạn của mảng");
//        } finally {
//            System.out.println("OKe vẫn chạy");
//        }
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (Exception ex ) {
            ex.printStackTrace();
            System.out.println("Chỉ số vượt quá mảng");
        }
    }
}
