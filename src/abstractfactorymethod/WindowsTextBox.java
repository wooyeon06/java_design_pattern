package abstractfactorymethod;

// 구체적인 제품: Windows 텍스트 박스
public class WindowsTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Rendering Windows TextBox");
    }
}