package java_exercise_youtube.JavaChap55;

public class Test {
    public static void main(String[] args) {
        Student student = new Student(102, "Cong Nhan", "Class 12", 8.3);
        Student student1 = new Student(202, "Baba Lo", "Class 11", 6.2);
        Student student2 = new Student(102, "Anh Oan", "Class 12", 8.3);

        System.out.println(student2.compareTo(student));
        System.out.println(student.compareTo(student1));
    }
}
