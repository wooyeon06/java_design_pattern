package abstractfactorymethod;

// 구체적인 제품: macOS 버튼
public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering MacOS Button");
    }
}
