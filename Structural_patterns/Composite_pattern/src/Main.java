import component.EmployeeComponent;
import composite.Manager;
import leaf.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeComponent dev1 = new Employee("Alice", "Developer");
        EmployeeComponent dev2 = new Employee("Bob", "Developer");

        Manager devManager = new Manager("Charlie", "Dev Manager");
        devManager.add(dev1);
        devManager.add(dev2);

        EmployeeComponent hr1 = new Employee("Diana", "HR");

        Manager ceo = new Manager("Eve", "CEO");
        ceo.add(devManager);
        ceo.add(hr1);

        // Show company hierarchy
        ceo.showDetails();
    }
}
