package designpatterns.patterns.structural.decorator._object.decorators;

import designpatterns.patterns.structural.decorator._object.bases.Base;

public abstract class Decorator implements Base {
    Base base;

    public Decorator(Base base) {
        this.base = base;
    }

    @Override
    public double cost() {
        return base.cost();
    }
}
