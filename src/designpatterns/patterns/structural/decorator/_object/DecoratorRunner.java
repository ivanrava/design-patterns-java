package designpatterns.patterns.structural.decorator._object;

import designpatterns.patterns.structural.decorator._object.bases.*;
import designpatterns.patterns.structural.decorator._object.decorators.*;

public class DecoratorRunner implements Runnable {
    @Override
    public void run() {
        Base coffee = new Decaf();
        coffee = new Brioche(new Whip(new ChocolateFlakes(coffee)));
        System.out.printf("%.2f%n", coffee.cost());
    }
}
