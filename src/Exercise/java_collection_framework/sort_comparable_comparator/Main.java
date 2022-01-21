package Exercise.java_collection_framework.sort_comparable_comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Truong", 24, "Hue");
        Student student1 = new Student("Duong", 23, "HN");
        Student student2 = new Student("Phuong", 22, "HCM");
        Student student3 = new Student("Tung", 23, "janpan");
        Student student4 = new Student("Mong", 23, "VM");

        List<Student> lists = new ArrayList<>();

        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);

        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sánh theo tuổi ");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
