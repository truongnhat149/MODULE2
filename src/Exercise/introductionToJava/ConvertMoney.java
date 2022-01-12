package Exercise.introductionToJava;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Money : ");

        int usd = scanner.nextInt();
        System.out.println("Convert vnd money is: " + usd * 22768);
        // 1/5/2022 theo tỉ giá hiện tại
    }
}
