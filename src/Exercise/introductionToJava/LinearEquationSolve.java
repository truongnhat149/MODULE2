package Exercise.introductionToJava;

import java.util.Scanner;

public class LinearEquationSolve {

    public static void main(String[] args) {

        System.out.println("Linear Euqation Solve");
        System.out.println("Method Superlative : ax + b  = c");

        Scanner equation = new Scanner(System.in);

        System.out.println("Enter a");
        double a = equation.nextDouble();

        System.out.println("Enter b");
        double b = equation.nextDouble();

        System.out.println("Enter c");
        double c = equation.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.print("Euqation pass with x = :\n" + answer);
        } else if (b == c) {
            System.out.print("The solution is all x!");
        } else {
            System.out.print("No solution");
        }
    }
}