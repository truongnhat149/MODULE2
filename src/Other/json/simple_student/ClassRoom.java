package json.simple_student;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    String classname;
    String address;
    Teacher teacher;

    @SerializedName("student_list")
    List<Student> studentList;

    public ClassRoom() {
        teacher = new Teacher();
        studentList = new ArrayList<>();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void display() {
        System.out.println("Class Name: " + classname + ", Address: " + address);
        System.out.println(teacher);

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
