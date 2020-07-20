package computer;

public class Computer {
    private String operatingSystem;
    private double processTact;
    private double memory;
    private int hardDrive;

    public Computer() {
    }

    public Computer(String operatingSystem, double processTact, double memory, int hardDrive) {
        this.operatingSystem = operatingSystem;
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }
    
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getProcessTact() {
        return processTact;
    }

    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
    
    
}
