package abstractfactorymethod;

// 구체적인 제품: Windows 버튼
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}
