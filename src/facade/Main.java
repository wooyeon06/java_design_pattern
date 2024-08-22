package facade;


/**
 * Facade 패턴은 구조적 디자인 패턴 중 하나로, 복잡한 시스템의 인터페이스를 단순화하는 역할을 합니다.
 * 이 패턴은 클라이언트와 복잡한 서브시스템 간의 상호 작용을 간소화하여 사용자가 더 쉽게 시스템을 사용할 수 있도록 도와줍니다.
 */
// 클라이언트 코드
public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();  // 컴퓨터 시작
        System.out.println("컴퓨터 사용 중...");
        computer.shutdownComputer(); // 컴퓨터 종료
    }
}
