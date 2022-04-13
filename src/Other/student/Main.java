package student;

import student.controller.Manager;
import student.view.StudentView;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentView man = new StudentView();
        Manager manager = new Manager();
        man.mainMenu();

        while (true) {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 :
                    man.addStudent();
                    break;
                case 2 :
                    man.showStudent();
                    break;
                case 3 :
                    manager.isCheckEmpty();
                    break;
                case 4 :
                    man.getQuantily();
                    break;
                case 5 :
                    man.studentEmpty();
                    break;
                case 6 :
                    man.exist();
                    break;
                case 7 :
                    //
                    break;
                case 8 :
                    //
                    break;
                case 9 :
                    //
                    break;
                case 0 : 
                    System.exit(0);
                default :
                    System.out.println("Nhập lại");
                    break;
            }
        }
    }
}
