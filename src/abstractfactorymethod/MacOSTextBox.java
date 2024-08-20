package abstractfactorymethod;

// 구체적인 제품: macOS 텍스트 박스
public class MacOSTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Rendering MacOS TextBox");
    }
}