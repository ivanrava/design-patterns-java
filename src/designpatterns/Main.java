package designpatterns;

import designpatterns.patterns.structural.facade.FacadeRunner;

public class Main {
    public static void main(String[] args) {
        Runnable designPatternRunner = new FacadeRunner();
        designPatternRunner.run();
    }
}
