package java_exercise_youtube.arraylist_student.main;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String codeStudent, fullName;
    private int birthYear;
    private double averageScore;

    public Student(String codeStudent, String fullName, int birthYear, double averageScore) {
        this.codeStudent = codeStudent;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.averageScore = averageScore;
    }

    public Student(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "codeStudent='" + codeStudent + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthYear=" + birthYear +
                ", averageScore=" + averageScore +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return  this.codeStudent.compareTo(o.codeStudent);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        return Objects.equals(codeStudent, ((Student) o).codeStudent);
    }

}
