package singleton;

public class Singleton {
    // 클래스의 유일한 인스턴스를 저장할 정적 변수
    private static Singleton instance;

    // 생성자를 private으로 정의하여 외부에서 인스턴스화하지 못하도록 방지
    private Singleton(String msg) {
        this.msg = msg;
    }

    private String msg;

    // 유일한 인스턴스를 반환하는 정적 메서드
    public static Singleton getInstance(String msg) {
        if (instance == null) {
            instance = new Singleton(msg);
        }
        return instance;
    }


    public void call() {
        System.out.println("call.... msg : " + msg);
    }

}