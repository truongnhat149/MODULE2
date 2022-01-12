package module2.ManagerMoive;

public class ShowDate {
    private int date;
    private int month;
    private int year;
    public ShowDate() {}
    public ShowDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public int getDate() {
        return this.date;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public int getMonth() {
        return this.month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return this.month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "date " + date + "/"
                + " month " + month
                + " year " + year ;
    }
}
