package designpatterns.patterns.structural.composite._object.uniformity;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private final List<Component> components = new ArrayList<>();

    @Override
    public int calculate() {
        return components.stream().mapToInt(Component::calculate).sum();
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public List<Component> getChildren() {
        return components;
    }
}
