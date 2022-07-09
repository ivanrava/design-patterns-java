package designpatterns.patterns.structural.composite._object.uniformity;

import java.util.List;

public class Leaf implements Component {
    private final int value;

    public Leaf(int value) {
        this.value = value;
    }

    @Override
    public int calculate() {
        return value;
    }

    @Override
    public void add(Component component) {
        throw new RuntimeException("This is a leaf!");
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException("This is a leaf!");
    }

    @Override
    public List<Component> getChildren() {
        throw new RuntimeException("This is a leaf!");
    }
}
