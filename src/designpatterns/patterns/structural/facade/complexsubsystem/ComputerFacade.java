package designpatterns.patterns.structural.facade.complexsubsystem;

public class ComputerFacade {
    private static final int BOOT_SECTOR = 0x40;
    private static final int BOOT_ADDRESS = 0x42;
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hdd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hdd = new HardDrive();
    }

    public void start() {
        ram.load(BOOT_ADDRESS, hdd.read(BOOT_SECTOR));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
