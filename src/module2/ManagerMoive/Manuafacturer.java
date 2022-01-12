package module2.ManagerMoive;

public class Manuafacturer {
    private String nameCompany;
    private String nation;
    public Manuafacturer() {}
    public Manuafacturer(String nameCompany, String nation) {
        this.nameCompany = nameCompany;
        this.nation = nation;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Manuafacturer{" +
                "nameCompany='" + nameCompany + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}
