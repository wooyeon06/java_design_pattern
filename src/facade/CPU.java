package facade;

// 서브시스템 클래스 1
class CPU {
    public void start() {
        System.out.println("CPU 시작");
    }

    public void execute() {
        System.out.println("CPU 명령 실행");
    }

    public void stop() {
        System.out.println("CPU 중지");
    }
}
