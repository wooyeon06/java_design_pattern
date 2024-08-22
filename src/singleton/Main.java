package singleton;

/**
 * 1.단일 인스턴스 보장: 특정 클래스의 인스턴스가 프로그램 내에서 하나만 존재하도록 보장합니다.
 *
 * 2. 전역 접근: 클래스의 인스턴스에 전역적으로 접근할 수 있는 방법을 제공합니다.
 *
 * 3. 게으른 초기화: 인스턴스가 실제로 필요할 때까지 생성하지 않는 방식으로, 시스템 자원을 절약할 수 있습니다.
 */
public class Main {

    public static void main(String args[]) {

        Singleton singleton = Singleton.getInstance("hello..");

        singleton.call();


        Singleton singleton2 = Singleton.getInstance("hello..2");

        singleton2.call();



    }

}
