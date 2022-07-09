package designpatterns.patterns.structural.decorator._object.decorators;

import designpatterns.patterns.structural.decorator._object.bases.Base;

public class Candies extends Decorator {
    public Candies(Base base) {
        super(base);
    }

    @Override
    public double cost() {
        return super.cost() + 0.6;
    }
}
