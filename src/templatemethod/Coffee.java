package templatemethod;

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
