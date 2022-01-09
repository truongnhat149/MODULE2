package vn.lpnt.AccessStaticMethod;

public class StaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1409, "Truong");
        Student s2 = new Student(2703, "HOA");
        Student s3 = new Student(806, "kinen");

        s1.display();
        s2.display();
        s3.display();
    }
    public static class Student {
        private int rollno;
        private String name;
        private static String college = "BBDIT";

        Student(int r, String n) {
            this.rollno = r;
            this.name = n;
        }

        static void change() {
            college = "CODEGYM - HUE";
        }
        void display() {
            System.out.println(rollno + " " + name + " " + college);
        }
    }
}