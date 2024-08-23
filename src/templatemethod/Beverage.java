package templatemethod;

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
