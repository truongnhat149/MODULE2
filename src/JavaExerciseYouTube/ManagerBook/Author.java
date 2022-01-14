package JavaExerciseYouTube.ManagerBook;

public class Author {
    private String name;
    private Date date;

    public Author() {
    }
    public Author(String name, Date date) {
        this.name = name;
        this.date = date;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
