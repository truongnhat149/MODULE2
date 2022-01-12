package Exercise.AccessStaticMethod;

public class StaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student student1 = new Student(1409, "truong");
//        Student student2 = new Student(200, "Hoa");
//        Student student3 = new Student(300, "Duong");
//        Student student1 = new Student();
//        Student student2 = new Student();
//        Student student3 = new Student();
       student1.display();
//        System.out.println(student2);
//        System.out.println(student3);
    }
    public static class Student {
        private int code;
        private String name;
        private static String college = "CODEGYM";

        public Student(int code, String name){
            this.code = code;
            this.name = name;
        }

        public Student() {

        }

         static void change() {
            college = "Code Gym HUE";
        }
        public void display() {
            System.out.println(this.code + " student code " + " name " + name + " slogan " + college);
        }
    }
}