package leaf;

import component.EmployeeComponent;

public class Employee implements EmployeeComponent {
    private final String name;
    private final String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println(position + ": " + name);
    }
}
