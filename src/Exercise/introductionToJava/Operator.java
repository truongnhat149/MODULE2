package Exercise.introductionToJava;

import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {

        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width");
        width = scanner.nextFloat();

        System.out.println("Enter Height");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("area is: " + area);
    }
}