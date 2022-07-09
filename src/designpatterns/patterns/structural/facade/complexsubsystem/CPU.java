package designpatterns.patterns.structural.facade.complexsubsystem;

public class CPU {
    public void execute() {
        System.out.println("Booted up!");
    }

    public void jump(int bootAddress) {
        System.out.println("Jumping to " +  bootAddress);
    }
}
