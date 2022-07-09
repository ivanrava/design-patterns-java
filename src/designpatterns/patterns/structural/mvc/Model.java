package designpatterns.patterns.structural.mvc;

import designpatterns.patterns.behavioral.observer._object.Publisher;
import designpatterns.patterns.behavioral.observer._object.State;

public class Model extends Publisher {
    public void newState(State newState) {
        super.state = newState;
        // Notifies view and controller
        notifySubscribers();
    }
}
