package abstractfactorymethod;

// 추상 팩토리
public interface GUIFactory {
    Button createButton();
    TextBox createTextBox();
}