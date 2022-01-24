package id_java.pass;

import java.util.Scanner;

public class PassSimple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user, pass;

        System.out.println("Enter your user");
        user = input.nextLine();
        System.out.println("Enter your pass");
        pass = input.nextLine();

        if (user.equals("admin") && pass.equals("admin")) {
            System.out.println("welcome menu");
        } else System.out.println("Error - please re-login ");
    }
}
