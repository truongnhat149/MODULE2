package module2.Student;

public class Student {
    private String id, firstLastName;
    private BirthDay birthDay;
    private double point;
    private Clasess className;

    public Student(String id, String firstLastName, BirthDay birthDay, double point, Clasess className) {
        this.id = id;
        this.firstLastName = firstLastName;
        this.birthDay = birthDay;
        this.point = point;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public BirthDay getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(BirthDay birthDay) {
        this.birthDay = birthDay;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public Clasess getClassName() {
        return className;
    }

    public void setClassName(Clasess className) {
        this.className = className;
    }
    public String getFaculty() {
        return this.className.getClassName();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstLastName='" + firstLastName + '\'' +
                ", birthDay=" + birthDay +
                ", point=" + point +
                ", className=" + className +
                '}';
    }
}
