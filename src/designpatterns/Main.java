package designpatterns;

import designpatterns.patterns.behavioral.observer._object.ObserverRunner;
import designpatterns.patterns.creational.simplefactory._object.SimpleFactoryRunner;

public class Main {
    public static void main(String[] args) {
        Runnable designPatternRunner = new ObserverRunner();
        designPatternRunner.run();
    }
}
