package designpatterns.patterns.structural.mvc;

import designpatterns.patterns.behavioral.observer._object.Observer;
import designpatterns.patterns.behavioral.observer._object.State;

public class View implements Observer {
    @Override
    public void update(State newState) {
        System.out.println("Reacting to model");
    }
}
