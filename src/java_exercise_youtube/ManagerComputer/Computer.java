package java_exercise_youtube.ManagerComputer;

import java.util.Objects;

public class Computer {
    private Manuafactor companyName;
    private Issue issue;
    private int price;
    private int insuranceMonth;

    public Computer(Manuafactor companyName, Issue issue, int price, int insuranceMonth) {
        this.companyName = companyName;
        this.issue = issue;
        this.price = price;
        this.insuranceMonth = insuranceMonth;
    }

    public Manuafactor getCompanyName() {
        return companyName;
    }

    public void setCompanyName(Manuafactor companyName) {
        this.companyName = companyName;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInsuranceMonth() {
        return insuranceMonth;
    }

    public void setInsuranceMonth(int insuranceMonth) {
        this.insuranceMonth = insuranceMonth;
    }
    public boolean isCheckPrice(Computer priceOther) {
        return this.price < priceOther.price;
    }

    public String CompanyName() {
        return this.companyName.getCompanyName();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return price == computer.price && insuranceMonth == computer.insuranceMonth && Objects.equals(companyName, computer.companyName) && Objects.equals(issue, computer.issue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, issue, price, insuranceMonth);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "companyName=" + companyName +
                ", issue=" + issue +
                ", price=" + price +
                ", insuranceMonth=" + insuranceMonth +
                '}';
    }
}
