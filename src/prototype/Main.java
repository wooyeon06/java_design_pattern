package prototype;

/**
 * 1. 객체 복제: 객체를 복사하여 새로운 객체를 생성하는 방법입니다.
 * 이때 객체를 복사하기 때문에, 생성 비용이 큰 객체나 복잡한 객체를 효율적으로 생성할 수 있습니다.
 *
 * 2. 클론 메서드: 복사를 위해, 클래스는 보통 clone() 메서드를 구현하여 자신을 복제할 수 있도록 합니다.
 * Java에서는 Cloneable 인터페이스를 구현하고 clone() 메서드를 오버라이드하는 것이 일반적입니다.
 *
 * 3. 원형 객체(Prototype Object): 복제의 원본이 되는 객체로, 이 객체를 복제하여 새로운 객체를 생성합니다
 */
public class Main {
    public static void main(String[] args) {
        // 원본 객체 생성
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 20);

        // 원본 객체 사용
        circle.draw();
        rectangle.draw();

        // 객체 복제
        Shape clonedCircle = circle.clone();
        Shape clonedRectangle = rectangle.clone();

        // 복제된 객체 사용
        clonedCircle.draw();
        clonedRectangle.draw();
    }


}
