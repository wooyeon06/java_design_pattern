package memento;


/**
 *
 Memento 패턴은 행동 디자인 패턴 중 하나로, 객체의 상태를 저장하고 필요할 때 그 상태를 복원할 수 있게 해주는 패턴입니다.
 이 패턴을 사용하면 객체의 내부 상태를 캡슐화하여, 객체의 상태를 외부에서 직접 접근하지 않고도 복원할 수 있습니다.
 */
// 클라이언트 코드
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("상태 1");
        originator.setState("상태 2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("상태 3");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("상태 4");

        System.out.println("저장된 상태 복원:");
        originator.getStateFromMemento(caretaker.get(0)); // 상태 2로 복원
        originator.getStateFromMemento(caretaker.get(1)); // 상태 3으로 복원
    }
}
