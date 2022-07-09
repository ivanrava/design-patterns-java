package designpatterns.patterns.structural.composite._object.uniformity;

import java.util.List;

public interface Component {
    int calculate();

    void add(Component component);

    void remove(Component component);

    List<Component> getChildren();
}
