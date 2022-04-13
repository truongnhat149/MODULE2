package student.model;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String codeStudent;
    private String fullname;
    private int age;
    private double average;

    public Student(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public Student(String codeStudent, String fullname, int age, double average) {
        this.codeStudent = codeStudent;
        this.fullname = fullname;
        this.age = age;
        this.average = average;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "codeStudent='" + codeStudent + '\'' +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", average=" + average +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Student other = (Student) o;
        return Objects.equals(this.codeStudent, other.codeStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeStudent, fullname, age, average);
    }

    public int compareTo(Student o) {
        return this.codeStudent.compareTo(o.codeStudent);
    }

}
