package design_parttern.structural_design_pattern.facede;

public class Table implements Furniture {
    @Override
    public void make() {
        System.out.println("Make a table");
    }
}
