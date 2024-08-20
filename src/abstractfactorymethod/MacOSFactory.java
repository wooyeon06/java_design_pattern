package abstractfactorymethod;

// 구체적인 팩토리: macOS GUI 팩토리
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MacOSTextBox();
    }
}