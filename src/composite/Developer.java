package composite;

// Leaf 클래스
class Developer extends Employee {
    public Developer(String name, String dept, int salary) {
        super(name, dept, salary);
    }

    @Override
    public void add(Employee employee) {
        // Leaf 노드는 자식을 가질 수 없으므로 아무 작업도 하지 않음
    }

    @Override
    public void remove(Employee employee) {
        // Leaf 노드는 자식을 가질 수 없으므로 아무 작업도 하지 않음
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println("Developer: " + name + ", Dept: " + dept + ", Salary: " + salary);
    }
}
