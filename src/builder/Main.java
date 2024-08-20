package builder;

/**
 * 1. 복잡한 객체의 생성: 객체가 복잡한 구성을 가지고 있을 때, 빌더 패턴을 사용하면 객체의 생성 과정을 단계별로 나누어 제어할 수 있습니다.
 *
 * 2. 유연한 객체 생성: 객체의 다양한 구성을 유연하게 처리할 수 있으며, 생성 과정에서 여러 옵션을 조합하여 객체를 구성할 수 있습니다.
 *
 * 3. 불변 객체의 생성: 객체를 불변(immutable)으로 만들고 싶을 때, 빌더 패턴을 사용하면 객체의 상태를 생성 시점에만 변경할 수 있게 할 수 있습니다.
 */
public class Main {
    public static void main(String[] args) {
        // 빌더를 사용하여 Computer 객체 생성
        Computer computer = new Computer.Builder()
                .setCPU("Intel Core i7")
                .setGPU("NVIDIA GTX 3080")
                .setRAM(16)
                .setStorage(512)
                .build();

        // 생성된 Computer 객체 사용
        System.out.println("CPU: " + computer.getCPU());
        System.out.println("GPU: " + computer.getGPU());
        System.out.println("RAM: " + computer.getRAM() + " GB");
        System.out.println("Storage: " + computer.getStorage() + " GB");
    }
}
