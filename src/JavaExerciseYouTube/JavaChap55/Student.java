package JavaExerciseYouTube.JavaChap55;

public class Student implements Comparable<Student>{
    private int codeStudent;
    private String nameStudent, className;
    private double averageScore;

    public Student(int codeStudent, String nameStudent, String className, double averageScore) {
        this.codeStudent = codeStudent;
        this.nameStudent = nameStudent;
        this.className = className;
        this.averageScore = averageScore;
    }

    public int getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(int codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getName() {
        String name = this.getClassName().trim();
        if (name.indexOf(" ") >= 0) {
            int temp = name.lastIndexOf(" ");
            return name.substring(temp + 1);
        } else {
            return name;
        }
    }
    @Override
    public int compareTo(Student o) {
        // > 0
        // < 0
        // = 0
        // dựa trên codeStudent
        // name: Truong, Nhu,
        String nameThis = this.getName();
        String nameO = o.getName();
        return nameThis.compareTo(nameO);
    }
}
