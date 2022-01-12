package module2.Student;

public class Main {
    public static void main(String[] args) {
        BirthDay birthDay1 = new BirthDay(15, 6, 1997);
        BirthDay birthDay2 = new BirthDay(30, 9, 2008);
        BirthDay birthDay3 = new BirthDay(28, 12, 1995);

        Clasess class1 = new Clasess("CodeGym- Hue", "CodeGym VietNam");
        Clasess class2 = new Clasess("CodeGym- QT", "CodeGym VietNam2");
        Clasess class3 = new Clasess("CodeGym- HN", "CodeGym VietNam3");

        Student student1 = new Student("c11","Le phung nhat Truong", birthDay1, 6.2, class1);
        Student student2 = new Student("c9","Nhat Linh", birthDay2, 4.9, class2);
        Student student3 = new Student("c4","Nhat Y Nhu", birthDay3, 9.0, class3);

        System.out.println(student1.getFaculty());
    }
}
