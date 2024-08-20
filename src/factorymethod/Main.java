package factorymethod;

/**
 *  1. 객체 생성의 위임: 팩토리 메소드 패턴에서는 객체를 생성하는 책임을 서브클래스에 위임합니다.
 * 이를 통해 클라이언트 코드에서 어떤 구체적인 클래스의 객체가 생성되는지 알 필요가 없어집니다.
 *
 *  2. 확장 가능성: 새로운 타입의 객체를 생성해야 할 때,
 * 기존 코드를 수정하지 않고 새로운 서브클래스를 만들어 객체 생성 로직을 확장할 수 있습니다.
 *
 *  3. 구체적인 클래스와의 결합도 감소: 클라이언트 코드와 객체 생성 로직을 분리하여 구체적인 클래스와의 결합도를 낮출 수 있습니다.
 */
public class Main {
    public static void main(String[] args) {
        CarFactory sportsCarFactory = new SportsCarFactory();
        Car sportsCar = sportsCarFactory.createCar();
        sportsCar.drive();

        CarFactory suvFactory = new SuvFactory();
        suvFactory.testDrive(); // "Driving an SUV!"
    }
}


// 제품 인터페이스
interface Car {
    void drive();
}

// 구체적인 제품: 스포츠카
class SportsCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a sports car!");
    }
}

// 구체적인 제품: SUV
class Suv implements Car {
    @Override
    public void drive() {
        System.out.println("Driving an SUV!");
    }
}

// 크리에이터: 팩토리 메소드를 선언
abstract class CarFactory {
    // 팩토리 메소드
    abstract Car createCar();

    // 팩토리 메소드를 사용하여 제품을 생성하고, 부가 작업을 수행
    public void testDrive() {
        Car car = createCar();
        car.drive();
    }
}

// 구체적인 크리에이터: 스포츠카 생성
class SportsCarFactory extends CarFactory {
    @Override
    Car createCar() {
        return new SportsCar();
    }
}

// 구체적인 크리에이터: SUV 생성
class SuvFactory extends CarFactory {
    @Override
    Car createCar() {
        return new Suv();
    }
}

