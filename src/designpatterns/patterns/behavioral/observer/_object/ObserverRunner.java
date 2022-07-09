package designpatterns.patterns.behavioral.observer._object;

public class ObserverRunner implements Runnable {
    @Override
    public void run() {
        Publisher concretePublisher = new Publisher();
        concretePublisher.attach(new EchoSystemOutObserver());
        concretePublisher.modifyValue();
    }
}
