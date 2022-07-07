package designpatterns.patterns.creational.simplefactory._object;

public class Screw implements AbstractProduct {
    @Override
    public String description() {
        return "I'm a screw!";
    }
}
