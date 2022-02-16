package design_parttern.structural_design_pattern.adapter;

public class Developer {
    public void receive(String info) {
        System.out.println("Retrieving infomation from Adapter");
        System.out.println(info);
    }
}
