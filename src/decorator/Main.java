package decorator;

/**
 * 데코레이터 패턴의 핵심 아이디어는 **"기존 객체에 새로운 기능을 동적으로 추가"**하는 것입니다.
 * 이 패턴은 상속을 사용하지 않고, 객체를 다른 객체로 감싸는 방식으로 기능을 확장할 수 있습니다.
 * 이를 통해 객체의 구조를 변경하지 않고도 기능을 추가하거나 수정할 수 있으며,
 * 여러 데코레이터를 조합하여 다양한 기능을 동적으로 부여할 수 있습니다.
 */
// Client 코드
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}
