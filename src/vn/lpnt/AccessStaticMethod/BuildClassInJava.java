package vn.lpnt.AccessStaticMethod;

public class BuildClassInJava {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.setName("TruongX"));;
        System.out.println(stu.setClasses("c1121i1Y"));;
    }
    public static class Student {
        private String name = "john";
        private String classes = "C02";

        public Student() {}
         String setName(String name) {
            return name;
        }
         String setClasses(String classes) {
            return classes;
        }
    }
}
