package adapter;

/**
 * 1. 두 클래스가 협력해야 하지만, 서로 다른 인터페이스를 제공할 때
 *
 * 2. 기존 클래스를 재사용하고 싶지만, 해당 클래스의 인터페이스가 원하는 인터페이스와 맞지 않을 때
 */
public class Main {
    public static void main(String[] args) {
        Voltage adapter = new Adapter(new OldElectricitySystem());

        System.out.println("Voltage: " + adapter.getVoltage());
    }
}


// 타겟 인터페이스
interface Voltage {
    String getVoltage();
}

// 어댑티: 기존 시스템
class OldElectricitySystem {
    public String getOldVoltage() {
        return "220V";
    }
}

// 어댑터: 타겟 인터페이스를 구현하고, 어댑티의 메서드를 호출하여 중재
class Adapter implements Voltage {
    private OldElectricitySystem oldSystem;

    public Adapter(OldElectricitySystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public String getVoltage() {
        return oldSystem.getOldVoltage();
    }
}