package designpatterns.patterns.behavioral.observer._object;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<>();
    State state = new State();

    public void attach(Observer s) {
        observers.add(s);
    }

    public void detach(Observer s) {
        observers.remove(s);
    }

    protected void notifySubscribers() {
        observers.forEach(observer -> observer.update(state));
    }

    public void modifyValue() {
        state.setValue(42);
        notifySubscribers();
    }
}
