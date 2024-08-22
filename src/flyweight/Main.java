package flyweight;

/**
 * Flyweight 패턴은 구조적 디자인 패턴 중 하나로, 많은 수의 객체를 효율적으로 관리하기 위해 사용됩니다.
 * 이 패턴은 동일하거나 유사한 객체를 공유함으로써 메모리 사용량을 줄이고 성능을 향상시키는 데 초점을 맞추고 있습니다.
 */
// 클라이언트 코드
public class Main {
    public static void main(String[] args) {
        Shape circle1 = ShapeFactory.getCircle();
        circle1.draw("Red");

        Shape circle2 = ShapeFactory.getCircle();
        circle2.draw("Blue");

        Shape circle3 = ShapeFactory.getCircle();
        circle3.draw("Green");
    }
}
