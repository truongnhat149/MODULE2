package example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public int age;
    public boolean gender;
    static List<Student> students = new ArrayList<>();


    public Student(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Truong", 18, true);
        students[1] = new Student("Duong", 28, true);
        students[2] = new Student("Phuong", 8, true);
        students[3] = new Student("Muong", 17, true);
        students[4]= new Student("Zuong", 26, true);
//        int len = students.length;
//        for (int i = 0; i < len; i++) {
//            if (this.age == 18) {
//                System.out.println("Có bạn 18 tuổi" + students.toString());
//            }
//        }
    }
    public void searchAge(Object[] o, int age) {
        int len = o.length;
        for (int i = 0; i < len; i++)
            if (age == 18) {
                System.out.println("");
            }
    }
}
