package designpatterns.patterns.structural.composite._object.uniformity;

import java.util.List;

public abstract class Component {
    public abstract int calculate();

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract List<Component> getChildren();
}
