package designpatterns.patterns.structural.mvc;

import designpatterns.patterns.behavioral.observer._object.Observer;
import designpatterns.patterns.behavioral.observer._object.State;

public class Controller implements Observer {
    private final View view;
    private final Model model;

    public Controller() {
        this.view = new View();
        this.model = new Model();

        model.attach(this);
        model.attach(view);
    }

    public void dummyUpdateModel() {
        model.newState(new State());
    }

    @Override
    public void update(State newState) {
        System.out.println("Reacting to model / view");
    }
}
