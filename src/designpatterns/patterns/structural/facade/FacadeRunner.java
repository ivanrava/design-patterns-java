package designpatterns.patterns.structural.facade;

import designpatterns.patterns.structural.facade.complexsubsystem.ComputerFacade;

public class FacadeRunner implements Runnable {
    @Override
    public void run() {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
