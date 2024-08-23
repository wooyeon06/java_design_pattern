package templatemethod;

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
