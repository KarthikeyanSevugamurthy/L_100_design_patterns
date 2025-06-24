package composite;

import component.EmployeeComponent;

import java.util.ArrayList;
import java.util.List;

public class Manager implements EmployeeComponent {
    private final String name;
    private final String position;
    private final List<EmployeeComponent> subordinates = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void add(EmployeeComponent emp) {
        subordinates.add(emp);
    }

    public void remove(EmployeeComponent emp) {
        subordinates.remove(emp);
    }

    @Override
    public void showDetails() {
        System.out.println(position + ": " + name);
        for (EmployeeComponent emp : subordinates) {
            emp.showDetails();
        }
    }
}
