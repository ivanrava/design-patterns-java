package designpatterns;

import designpatterns.patterns.structural._class.adapter.AdapterClassRunner;
import designpatterns.patterns.structural._object.adapter.AdapterObjectRunner;

public class Main {
    public static void main(String[] args) {
        Runnable designPatternRunner = new AdapterClassRunner();
        designPatternRunner.run();
    }
}
