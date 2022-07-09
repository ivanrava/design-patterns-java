package designpatterns.patterns.structural.decorator._object.decorators;

import designpatterns.patterns.structural.decorator._object.bases.Base;

public class Brioche extends Decorator {
    public Brioche(Base base) {
        super(base);
    }

    @Override
    public double cost() {
        return super.cost() + 1;
    }
}
