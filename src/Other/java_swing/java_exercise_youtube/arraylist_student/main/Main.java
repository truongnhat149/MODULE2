package java_exercise_youtube.arraylist_student.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayListStudent arrayListStudent = new ArrayListStudent();

        int option = 0;
        do {
            System.out.println("*** MeNu ***");
            System.out.println(
                            "1. thêm sinh viên vào danh sách\n" +
                            "2. in danh sách ra.\n" +
                            "3. kiểm tra danh sách có rỗng không\n" +
                            "4. lấy ra số lượng sinh viên có trong danh sách\n" +
                            "5. làm rỗng danh sách\n" +
                            "6. kiểm tra sinh viên có tồn tại không dựa trên dah sách sinh viên\n" +
                            "7. xóa 1 sinh viên ra khỏi dsach\n" +
                            "8. tìm kiếm tất cả sinh viên dựa trên danh sách\n" +
                            "9. xuất ra danh sách sinh viên có điểm từ cao -> thấp\n" +
                            "0. thoát khỏi chương trình"
            );
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                // add Student in array list
                case 1:
                    System.out.println("Enter a student code : "); String codeStudent = sc.nextLine();
                    System.out.println("Enter a full name and last name : "); String fullName = sc.nextLine();
                    System.out.println("Enter the year of birth : "); int birthYear = sc.nextInt();
                    System.out.println("Enter an average score : "); double averageScore = sc.nextDouble();
                    Student student = new Student(codeStudent, fullName, birthYear, averageScore);
                    arrayListStudent.addStudent(student);
                    break;
                case 2: // print array list on screen
                    arrayListStudent.printListStudent();
                    break;
                case 3:
                    System.out.println("Check to see if the list is empty: "
                            + arrayListStudent.isArrayListEmpty());
                    break;
                case 4:
                    System.out.println("Take out the number of students on the list: "
                            + arrayListStudent.getStudentsInTheField());
                    break;
                case 5:
                    System.out.println("Empty the list : ");
                    arrayListStudent.emptyTheList();
                    break;
                case 6:
                    System.out.println("Enter codeStudent: "); String codeStudent1 = sc.nextLine();
                    Student student1 = new Student(codeStudent1);
                    System.out.println("Check out the students on the list :" + arrayListStudent.isCheckTheExistence(student1));
                    break;
                case 7:
                    System.out.println("Enter code Student: " ); String codeStudent2 = sc.nextLine();
                    Student student2 = new Student(codeStudent2);
                    System.out.println("Remove student from the list " + arrayListStudent.removeStudent(student2));
                    break;
                case 8:
                    System.out.println("Enter full name"); String fullname = sc.nextLine();
                    System.out.println("result search : " );
                    arrayListStudent.searchStudent(fullname);
                    break;
                case 9:
                    arrayListStudent.arrangeStudentScoresFromHighToLow();
                    arrayListStudent.printListStudent();
                    break;
                case 0:
                    break;

            }
        } while (option != 0);
    }
}
