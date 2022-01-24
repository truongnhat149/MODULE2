package exercise_james.java_collection_framework.hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student students = new Student("truong", "84 KTD", 24);
        Student student2 = new Student("linh", "20 nTC", 27);
        Student student3 = new Student("hoa", "japan", 22);
        Student student4 = new Student("nhu", "australia", 13);

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, students);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(1, student4);
        // khi put dữ liệu vào nếu trùng key nhưng khác value thì
        // dữ liệu chia ra
        // khi trùng key và trùng cả value thì dữ liệu sau sẽ đè lên dữ liệu trước

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println("...........Set");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(students);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        for (Student student: studentSet) {
            System.out.println(student.toString());
        }
    }
}
