package exercise_james.binary_file_and_serialization.read_write_list_file;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private String addess;

    public Student(int id, String name, String addess) {
        this.id = id;
        this.name = name;
        this.addess = addess;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddess() {
        return addess;
    }

    public void setAddess(String addess) {
        this.addess = addess;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addess='" + addess + '\'' +
                '}';
    }
}
