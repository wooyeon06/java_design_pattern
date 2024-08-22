package composite;

// Component 추상 클래스
abstract class Employee {
    protected String name;
    protected String dept;
    protected int salary;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public abstract void add(Employee employee);

    public abstract void remove(Employee employee);

    public abstract void displayEmployeeInfo();
}
