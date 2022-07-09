package designpatterns.patterns.structural.facade.complexsubsystem;

public class HardDrive {
    public int read(int bootSector) {
        System.out.println("Reading sector " + bootSector);
        return 0xdeadbeef;
    }
}
