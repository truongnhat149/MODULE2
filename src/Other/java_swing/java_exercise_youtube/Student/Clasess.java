package java_exercise_youtube.Student;

public class Clasess {
    private String className, facultyName;

    public Clasess(String className, String facultyName) {
        this.className = className;
        this.facultyName = facultyName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    @Override
    public String toString() {
        return "Clasess{" +
                "className='" + className + '\'' +
                ", facultyName='" + facultyName + '\'' +
                '}';
    }
}
