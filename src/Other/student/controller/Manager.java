package student.controller;

import student.model.Student;

import java.util.*;

public class Manager {
    private List<Student> listStudent;
    public Scanner scanner = new Scanner(System.in);

    public Manager() {
        this.listStudent = new ArrayList<>();
    }

    public void addStudent(String codeStudent, String fullname, int age, double average) {
        Student student = new Student(codeStudent, fullname, age, average);
        listStudent.add(student);
    }

    public void showStudent() {
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }

    public boolean isCheckEmpty() {
        return this.listStudent.isEmpty();
    }

    public int getQuantily() {
       return this.listStudent.size();
    }

    public void studentEmpty() {
        this.listStudent.removeAll(listStudent);
    }

    public boolean isExist() {
        System.out.println("Sinh viên có tồn tại trong list không?"); String codeStudent = scanner.nextLine();
        Student student = new Student(codeStudent);
        return this.listStudent.contains(student);
    }

    public boolean removeStudent(Student student) {
        return this.listStudent.remove(student);
    }

    public void findStudent(String name) {
        for (Student student : listStudent) {
            if (student.getFullname().indexOf(name) >= 0)
                System.out.println(student);
        }
    }

    public void sortDESC() {
        Collections.sort(this.listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o2.getAverage() > o1.getAverage()) {
                    return 1;
                } else if (o2.getAverage() == o1.getAverage()) {
                    return 0;
                } else
                    return -1;
            }
        });
    }
}
