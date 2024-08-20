package templatemethod;


/**
 * 1. 알고리즘의 틀 제공: 템플릿 메서드 패턴에서 상위 클래스는 알고리즘의 기본 틀을 제공합니다. 이 틀은 여러 단계로 나뉘며,
 * 이 중 일부 단계는 하위 클래스에서 구체적으로 구현해야 합니다.
 *
 * 2. 구현의 유연성 제공: 하위 클래스는 상위 클래스에서 정의된 템플릿 메서드의 특정 단계를 재정의하여 구체적인 동작을 정의할 수 있습니다.
 *
 * 3. 코드 재사용성: 상위 클래스는 공통된 알고리즘의 틀을 제공함으로써 코드 중복을 줄이고, 코드 재사용성을 높일 수 있습니다.
 */
public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.prepareBeverage();

        System.out.println();

        Beverage tea = new Tea();
        tea.prepareBeverage();
    }
}

// 추상 클래스: 음료 준비 과정의 템플릿을 정의
abstract class Beverage {

    // 템플릿 메서드: 음료 준비의 기본 골격을 정의
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 공통 메서드
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // 추상 메서드: 하위 클래스에서 구체적으로 구현해야 함
    abstract void brew();
    abstract void addCondiments();
}

// 구체 클래스: 커피 준비 과정 구현
class Coffee extends Beverage {

    @Override
    void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}

// 구체 클래스: 차 준비 과정 구현
class Tea extends Beverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}


