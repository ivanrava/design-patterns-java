package designpatterns.patterns.structural.facade.complexsubsystem;

public class Memory {
    public void load(int bootAddress, int readData) {
        System.out.printf("Loading data 0x%x in 0x%x boot address (RAM)%n", readData, bootAddress);
    }
}
