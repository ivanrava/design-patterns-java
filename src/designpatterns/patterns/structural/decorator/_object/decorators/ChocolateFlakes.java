package designpatterns.patterns.structural.decorator._object.decorators;

import designpatterns.patterns.structural.decorator._object.bases.Base;

public class ChocolateFlakes extends Decorator {
    public ChocolateFlakes(Base base) {
        super(base);
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }
}
