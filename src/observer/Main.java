package observer;

/**
 * Observer 패턴은 행동 디자인 패턴 중 하나로, 객체 간의 일대다(one-to-many) 관계를 정의하여,
 * 하나의 객체 상태가 변경될 때,
 * 그 객체와 연관된 다른 객체들에게 자동으로 알림이 가고 업데이트가 이루어지도록 하는 패턴입니다.
 * 이 패턴은 주로 이벤트 기반 시스템에서 사용됩니다.
 */

// 클라이언트 코드
public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel();

        Observer subscriber1 = new Subscriber("Alice");
        Observer subscriber2 = new Subscriber("Bob");
        Observer subscriber3 = new Subscriber("Charlie");

        channel.registerObserver(subscriber1);
        channel.registerObserver(subscriber2);
        channel.registerObserver(subscriber3);

        channel.upload("New Video Uploaded!");

        channel.removeObserver(subscriber2);

        channel.upload("Another Video Uploaded!");
    }
}
