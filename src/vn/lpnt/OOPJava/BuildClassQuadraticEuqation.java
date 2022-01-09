package vn.lpnt.OOPJava;
import java.util.*;

public class BuildClassQuadraticEuqation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a,b,c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminart();
        double getRoot1 = quadraticEquation.getRoot1();
        double getRoot2 = quadraticEquation.getRoot2();
        if (delta > 0) {
            System.out.println("The equation has two solutions : " + getRoot1 + " and " +getRoot2);
        } else if ( delta == 0) {
            System.out.println("Equation with double solution " + (-b / (2*a)));
        } else {
            System.out.println("The equation has no solution ");
        }
    }
    public static class QuadraticEquation {
        double a, b, c, delta;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getDiscriminart() {
            return delta = Math.pow(b, 2) - 4*a*c;
        }
        public double getRoot1() {
            return (-b + Math.sqrt(b*b - 4*a*c)) / 2*a;
        }
        public double getRoot2() {
            return (-b - Math.sqrt(b*b - 4*a*c)) / 2*a;
        }
    }
}
