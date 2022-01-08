package vn.lpnt.Array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student[] = {"Truong", "Vo Danh", "Linh"};


        System.out.print("Enter name your finding");
        String inputName = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(inputName)) {
                System.out.println("Position is the students in the list " + inputName + " is " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + inputName + " in the list");
        }
    }
}
