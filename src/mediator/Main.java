package mediator;

/**
 * Mediator 패턴은 행동 디자인 패턴 중 하나로,
 * 객체들 간의 복잡한 상호작용을 캡슐화하여 객체들이 서로 직접 통신하지 않고,
 * 중재자(Mediator) 객체를 통해 통신하게 하는 패턴입니다. 이 패턴은 객체 간의 결합도를 줄이고,
 * 상호작용을 하나의 중재자 객체로 집중시켜 코드의 유지보수성을 높입니다.
 */
// 클라이언트 코드
public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new ChatUser(mediator, "Alice");
        User user2 = new ChatUser(mediator, "Bob");
        User user3 = new ChatUser(mediator, "Charlie");
        User user4 = new ChatUser(mediator, "Diana");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hello, everyone!");
    }
}
