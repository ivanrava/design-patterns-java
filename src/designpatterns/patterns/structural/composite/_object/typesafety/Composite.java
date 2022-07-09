package designpatterns.patterns.structural.composite._object.typesafety;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private final List<Component> components = new ArrayList<>();

    public int calculate() {
        return components.stream().mapToInt(Component::calculate).max().getAsInt();
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public List<Component> getChildren() {
        return components;
    }
}
