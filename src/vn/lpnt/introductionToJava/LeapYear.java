package vn.lpnt;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year?");
        long leapYear = input.nextLong();

        if (leapYear % 4 == 0 && !(leapYear % 100 == 0)) {
            System.out.print("it's a leap year");
        } else if (leapYear % 100 == 0 && !(leapYear % 400 == 0)) {
            System.out.print("ít is not a leap year");
        } else if (leapYear % 100 == 0 && leapYear % 400 == 0) {
            System.out.print("ít is a leap year");
        }
    }
}
