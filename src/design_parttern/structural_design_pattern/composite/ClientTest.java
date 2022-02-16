package design_parttern.structural_design_pattern.composite;

public class ClientTest {
    public static void main(String[] args) {
        Developer dev1 = new Developer(30, "Truong", 200);
        Developer dev2 = new Developer(25, "Nhat ", 500);

        Leader leader = new Leader(45, "Sam", 600);
        leader.add(dev1);
        leader.add(dev2);

        BusinessAnalyst ba = new BusinessAnalyst(24, "TN", 400);

        Boss boss = new Boss(50, "Truong", 500);
        boss.add(leader);
        boss.add(ba);
        boss.print();
    }
}
