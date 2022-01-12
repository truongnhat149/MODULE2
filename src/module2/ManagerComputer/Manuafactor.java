package module2.ManagerComputer;

public class Manuafactor {
    private String companyName;
    private National countryName;

    public Manuafactor(String companyName, National countryName) {
        this.companyName = companyName;
        this.countryName = countryName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public National getCountryName() {
        return countryName;
    }

    public void setCountryName(National countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Manuafactor{" +
                "companyName='" + companyName + '\'' +
                ", countryName=" + countryName +
                '}';
    }
}
