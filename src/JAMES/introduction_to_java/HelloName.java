package exercise_james.introduction_to_java;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String yourName = scanner.nextLine();

        System.out.println("Hello " + yourName);
    }
}
