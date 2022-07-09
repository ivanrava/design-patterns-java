package designpatterns.patterns.behavioral.observer._object;

public class EchoSystemOutObserver implements Observer {
    @Override
    public void update(State newState) {
        System.out.println(newState.getValue());
    }
}
