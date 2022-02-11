package exercise_james.thread.thread_classic;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            // System.out.println("Input number begin 1");

            int n1 = Integer.MAX_VALUE - 100;
            System.out.println("Input number begin 2");
            int n2 = scanner.nextInt();
            NumberGenerator num1 = new NumberGenerator(n1);
            NumberGenerator num2 = new NumberGenerator(n2);

            Thread t1 = new Thread(num1);
            Thread t2 = new Thread(num2);

            t1.start();
            t2.start();
        } catch (NoSuchElementException e) {
            System.out.println("Not number! ");
        }
    }
}
