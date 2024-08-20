package abstractfactorymethod;

/**
 *
 추상 팩토리(Abstract Factory) 패턴은 생성 패턴(Creational Pattern) 중 하나로,
 관련성 있는 여러 객체를 생성할 수 있는 인터페이스를 제공하는 디자인 패턴입니다. 이 패턴은 구체적인 클래스에 의존하지 않고,
 객체의 생성과 관련된 클세부 사항을 캡슐화하여 라이언트 코드가 독립적으로 객체를 생성할 수 있도록 합니다.
 주로 서로 연관된 객체들을 함께 생성하고 관리할 때 사용됩니다.

 !! 추상 팩토리 패턴의 핵심 개념
 1. 관련된 객체 그룹 생성: 동일한 주제나 스타일을 갖는 여러 객체를 생성할 때 사용됩니다. 예를 들어, 다양한 스타일의 GUI 컴포넌트(버튼, 텍스트 박스 등)를 생성할 수 있습니다.

 2. 추상화된 인터페이스: 객체 생성에 필요한 인터페이스를 정의하여, 클라이언트가 구체적인 클래스에 의존하지 않도록 합니다.

 3. 구체적인 팩토리 클래스: 인터페이스를 구현하여 특정 객체들을 생성하는 구체적인 팩토리 클래스를 정의합니다.

 !! 추상 팩토리 패턴의 구성 요소
 1. AbstractFactory (추상 팩토리): 관련된 객체를 생성할 수 있는 메서드를 정의합니다.
 2. ConcreteFactory (구체적인 팩토리): AbstractFactory 인터페이스를 구현하여 실제 객체를 생성합니다.
 3. AbstractProduct (추상 제품): 생성될 객체의 인터페이스를 정의합니다.
 4. ConcreteProduct (구체적인 제품): AbstractProduct를 구현하여 실제 객체를 정의합니다.
 4. Client (클라이언트): AbstractFactory 인터페이스를 사용하여 객체를 생성합니다.
 */


public class Main {
    private final Button button;
    private final TextBox textBox;

    // 클라이언트는 추상 팩토리를 사용하여 객체를 생성
    public Main(GUIFactory factory) {
        this.button = factory.createButton();
        this.textBox = factory.createTextBox();
    }

    public void renderUI() {
        button.render();
        textBox.render();
    }

    public static void main(String[] args) {
        // Windows 환경에서 GUI를 생성
        GUIFactory windowsFactory = new WindowsFactory();
        Main windowsUI = new Main(windowsFactory);
        windowsUI.renderUI();

        System.out.println();

        // macOS 환경에서 GUI를 생성
        GUIFactory macFactory = new MacOSFactory();
        Main macUI = new Main(macFactory);
        macUI.renderUI();
    }
}