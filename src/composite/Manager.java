package composite;

import java.util.ArrayList;
import java.util.List;

// Composite 클래스
class Manager extends Employee {
    private List<Employee> subordinates;

    public Manager(String name, String dept, int salary) {
        super(name, dept, salary);
        subordinates = new ArrayList<>();
    }

    @Override
    public void add(Employee employee) {
        subordinates.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println("Manager: " + name + ", Dept: " + dept + ", Salary: " + salary);
        for (Employee e : subordinates) {
            e.displayEmployeeInfo();
        }
    }
}
