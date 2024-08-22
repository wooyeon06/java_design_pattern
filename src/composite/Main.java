package composite;

/**
 * 컴포지트 패턴의 핵심 아이디어는 **"트리 구조"**를 사용하여 객체들을 계층적으로 구성하고, 
 * 이 계층 구조에서 개별 객체와 복합 객체를 동일하게 다룰 수 있도록 하는 것입니다. 
 * 이를 통해 클라이언트는 복잡한 구조를 신경 쓰지 않고 단순하게 객체들을 처리할 수 있습니다
 */
// Client 코드
public class Main {
    public static void main(String[] args) {
        Employee developer1 = new Developer("John", "Development", 10000);
        Employee developer2 = new Developer("Doe", "Development", 15000);

        Employee manager1 = new Manager("Smith", "Development", 25000);
        manager1.add(developer1);
        manager1.add(developer2);

        Employee developer3 = new Developer("Jane", "Design", 20000);

        Employee generalManager = new Manager("Robert", "Head", 50000);
        generalManager.add(manager1);
        generalManager.add(developer3);

        generalManager.displayEmployeeInfo();
    }
}
