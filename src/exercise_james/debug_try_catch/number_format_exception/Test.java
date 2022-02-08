package exercise_james.debug_try_catch.number_format_exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculationExample cal = new CalculationExample();
        System.out.println("Nhập a, b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            cal.cong(a, b);
            cal.tru(a, b);
            cal.nhan(a, b);
            cal.chia(a, b);

        } catch (Exception ex) {
            System.out.println("Lỗi! Nhập lại" + ex.getMessage());
        }
    }
}
