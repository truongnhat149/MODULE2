package design_parttern.structural_design_pattern.composite;

public class BusinessAnalyst extends Employee {
    public BusinessAnalyst(int age, String name, double salary) {
        super(age, name, salary);

    }
    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public void print() {
        System.out.println("============");
        System.out.println("name" + this.name);
        System.out.println("age" + this.age);
        System.out.println("salary" + this.salary);
        System.out.println("============");
    }
}
