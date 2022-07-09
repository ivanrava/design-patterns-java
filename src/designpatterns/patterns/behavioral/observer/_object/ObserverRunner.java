package designpatterns.patterns.behavioral.observer._object;

public class ObserverRunner implements Runnable {
    @Override
    public void run() {
        Subject subject = new Subject();
        subject.attach(new EchoSystemOutObserver());
        subject.modifyValue();
    }
}
