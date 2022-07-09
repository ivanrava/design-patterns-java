package designpatterns;

import designpatterns.patterns.structural.composite._object.typesafety.CompositeTypeSafetyRunner;

public class Main {
    public static void main(String[] args) {
        Runnable designPatternRunner = new CompositeTypeSafetyRunner();
        designPatternRunner.run();
    }
}
