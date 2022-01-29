package student.view;

import student.controller.Manager;
import student.model.Student;

import java.util.Scanner;

public class StudentView {
    public Scanner scanner = new Scanner(System.in);
    Manager manager = new Manager();


    public void mainMenu() {
        System.out.println("Menu");
        System.out.println("Vui lòng chọn chức năng");
        System.out.println(
                "1. thêm sinh viên vào danh sách\n" +
                "2. in danh sách sinh viên ra màn hình\n" +
                "3. kiểm tra danh sách có rỗng không?\n" +
                "4. Lấy ra số lượng sinh viên trong danh sách\n" +
                "5. Làm rỗng danh sách sinh viên\n" +
                "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không? dựa trên mã sinh viên\n" +
                "7. xóa 1 sinh viên ra khỏi danh sách\n" +
                "8. Tìm kiếm tất cả sinh viên dựa trên tên\n" +
                "9. In ra màn hình sinh viên có điểm từ cao đến thấp");
        System.out.println("0. Exit");
        System.out.println("**********************************");
    }

    public void addStudent() {
        System.out.println("Nhập mã sinh viên: ");
        String codeStudent = scanner.nextLine();
        System.out.println("Nhập họ và tên: ");
        String fullname = scanner.nextLine();
        System.out.println("Nhập năm sinh: ");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm trung bình");
        double average = scanner.nextDouble();
        manager.addStudent(codeStudent, fullname, age, average);
        mainMenu();
        scanner.nextLine();
    }

    public void showStudent() {
        System.out.println("In danh sách sinh viên ");
        manager.showStudent();
    }

    public void checkStudentEmpty() {
//        System.out.println("Kiểm tra danh sách có rỗng: ");
         manager.isCheckEmpty();
    }

    public void getQuantily() {
        System.out.println("Lấy ra số lượng sinh viên trong danh sách");
        manager.getQuantily();
    }

    public void studentEmpty() {
        System.out.println("Danh sách đã làm rỗng");
        manager.studentEmpty();
    }

    public void exist() {
        manager.isExist();
    }

    public void removeStudent(Student student) {
        System.out.println("Xóa 1 sinh viên trong list ");
        manager.removeStudent(student);
    }

    public void findStudent(String name) {
        manager.findStudent(name);
    }

    public void sortDESC() {
        manager.sortDESC();
    }
}

