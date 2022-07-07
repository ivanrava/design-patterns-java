package designpatterns;

import designpatterns.patterns.creational.simplefactory._object.SimpleFactoryRunner;

public class Main {
    public static void main(String[] args) {
        Runnable designPatternRunner = new SimpleFactoryRunner();
        designPatternRunner.run();
    }
}
