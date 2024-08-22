package facade;

// Facade 클래스
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.start();
        memory.load();
        hardDrive.readData();
        cpu.execute();
    }

    public void shutdownComputer() {
        cpu.stop();
        memory.free();
        hardDrive.writeData();
    }
}
