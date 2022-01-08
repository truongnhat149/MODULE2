package vn.lpnt;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight");
        float weight = scanner.nextFloat();

        System.out.print("Enter height");
        float height = scanner.nextFloat();

        double bmi = weight / height*height;

        if (bmi < 18.5) {
            System.out.println("Underweidth");
        } else if (18.5 < bmi && bmi < 25.0) {
            System.out.println("Normal");
        } else if (25.0 <= bmi && bmi < 30.0) {
            System.out.println("Overweight");
        } else if (30.0 <= bmi) {
            System.out.println("Obese");
        }
    }
}

