package state;


/**
 * State 패턴은 객체의 상태에 따라 그 객체의 행동을 변경하는 디자인 패턴입니다.
 * 객체가 상태를 바꿀 때, 객체의 클래스가 변경되는 것처럼 행동합니다.
 * 즉, 객체의 상태를 캡슐화하여 상태에 따른 행동을 객체 내부에서 처리할 수 있게 하는 패턴입니다.
 *
 * 주요 구성 요소
 * Context(문맥):
 *
 * 상태에 따라 행동이 달라지는 객체입니다. Context 클래스는 현재 상태를 나타내는 상태 객체를 가지고 있으며,
 * 클라이언트가 요청을 할 때 해당 상태 객체에게 작업을 위임합니다.
 *
 * State(상태):
 *
 * 상태를 나타내는 인터페이스 또는 추상 클래스입니다. 이 인터페이스는 상태별로 달라지는 행동을 정의합니다.
 *
 * ConcreteState(구체적인 상태):
 *
 * State 인터페이스를 구현한 클래스들입니다. 각 클래스는 특정 상태에 따른 행동을 정의합니다.
 */
public class Main {
    public static void main(String[] args) {
        DoorContext context = new DoorContext();

        State doorOpen = new DoorOpenState();
        State doorClosed = new DoorClosedState();

        // 문을 여는 상태로 전환
        context.setState(doorOpen);
        context.applyState();

        // 문을 닫는 상태로 전환
        context.setState(doorClosed);
        context.applyState();
    }
}
