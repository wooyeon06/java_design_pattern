package builder;

// 제품 클래스
public class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;

    // Private constructor to be used by the builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    // Getters for the fields
    public String getCPU() { return CPU; }
    public String getGPU() { return GPU; }
    public int getRAM() { return RAM; }
    public int getStorage() { return storage; }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private String GPU;
        private int RAM;
        private int storage;

        // Builder methods to set the fields
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        // Build method to create the final object
        public Computer build() {
            return new Computer(this);
        }
    }
}
