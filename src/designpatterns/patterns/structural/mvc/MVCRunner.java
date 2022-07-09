package designpatterns.patterns.structural.mvc;

public class MVCRunner implements Runnable {
    @Override
    public void run() {
        Controller c = new Controller();
        c.dummyUpdateModel();
    }
}
