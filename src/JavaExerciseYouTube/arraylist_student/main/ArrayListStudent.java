package JavaExerciseYouTube.arraylist_student.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListStudent {
    private ArrayList<Student> listStudent;

    public ArrayListStudent() {
        this.listStudent = new ArrayList<Student>();
    }

    public ArrayListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    // thêm sinh viên vào danh sách
    public void addStudent(Student student) {
        this.listStudent.add(student);
    }

    // in danh sách sinh viên ra màn hình
    public void printListStudent() {
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }

    // check arraylist isEmpty?
    public boolean isArrayListEmpty() {
        return this.listStudent.isEmpty();
    }

    // get the number a student in array
    public int getStudentsInTheField() {
        return this.listStudent.size();
    }

    // empty the list
    public void emptyTheList() {
        this.listStudent.removeAll(listStudent);
    }

    // Check the existence
    public boolean isCheckTheExistence(Student student) {
        return this.listStudent.contains(student);
    }

    // remove a student from the list by student code
    public boolean removeStudent(Student student) {
        return this.listStudent.remove(student);
    }
    // Search for students by name
    public void searchStudent(String name) {
        for (Student student : listStudent) {
            if (student.getFullName().indexOf(name) >= 0) {
                System.out.println(student);
            }
        }
    }
    // export to the list screen from high to low
    public void arrangeStudentScoresFromHighToLow() {
        Collections.sort(this.listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student firstStudent, Student secondStudent) {
                if (firstStudent.getAverageScore() < secondStudent.getAverageScore())
                    return 1;
                else if (firstStudent.getAverageScore() > secondStudent.getAverageScore())
                    return -1;
                else return 0;
            }
        });
    }
}
