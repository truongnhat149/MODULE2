package design_parttern.structural_design_pattern.composite;

import java.util.ArrayList;

public class Leader extends Employee {
    private ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public Leader(int age, String name, double salary) {
        super(age, name, salary);
    }

    @Override
    public void add(Employee employee) {
        employeeArrayList.remove(employee);
    }

    @Override
    public void remove(Employee employee) {
        employeeArrayList.remove(employee);
    }

    @Override
    public void print() {
        System.out.println("==================");
        System.out.println("Name : " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
        System.out.println("==================");

        for (Employee employee : employeeArrayList) {
            employee.print();
        }
    }
}
