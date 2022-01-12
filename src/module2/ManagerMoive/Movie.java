package module2.ManagerMoive;

public class Movie {
    private String moiveName;
    private int issue;
    private Manuafacturer nameCompany;
    private int price;
    private ShowDate showDate;

    public Movie(String moiveName, int issue, Manuafacturer nameCompany, int price, ShowDate showDate) {
        this.moiveName = moiveName;
        this.issue = issue;
        this.nameCompany = nameCompany;
        this.price = price;
        this.showDate = showDate;
    }

    public String getMoiveName() {
        return moiveName;
    }

    public void setMoiveName(String moiveName) {
        this.moiveName = moiveName;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public Manuafacturer getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(Manuafacturer nameCompany) {
        this.nameCompany = nameCompany;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ShowDate getShowDate() {
        return showDate;
    }

    public void setShowDate(ShowDate showDate) {
        this.showDate = showDate;
    }
    public void printNameCompany() {
        System.out.println(this.nameCompany);
    }
    public boolean isCheckPrice(Movie priceOther) {
        return this.price == priceOther.price;
    }
    public double priceDisscount(double x) {
         return this.price * (1 - x/100);
    }
    @Override
    public String toString() {
        return "Movie{" +
                "moiveName='" + moiveName + '\'' +
                ", issue=" + issue +
                ", nameCompany=" + nameCompany +
                ", price=" + price +
                ", showDate=" + showDate +
                '}';
    }
}
