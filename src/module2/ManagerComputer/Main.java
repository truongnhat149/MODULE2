package module2.ManagerComputer;

public class Main {
    public static void main(String[] args) {
        Issue issue = new Issue(12, 4, 1997);
        Issue issue2 = new Issue(12, 4, 1997);

        National national = new National("0123C1", "New York");
        National national2 = new National("C014D", "Ha Noi");

        Manuafactor manuafactor = new Manuafactor("SoNY", national);
        Manuafactor manuafactor2 = new Manuafactor("Huda", national2);

        Computer computer = new Computer(manuafactor, issue, 4000000, 12);
        Computer computer2 = new Computer(manuafactor2, issue2, 300000, 9);
        System.out.println(computer.isCheckPrice(computer2));
        System.out.println(computer.CompanyName());
    }
}
