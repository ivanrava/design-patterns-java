package designpatterns.patterns.structural.composite._object.typesafety;

public class Leaf extends Component {
    private final int value;

    public Leaf(int value) {
        this.value = value;
    }

    @Override
    public int calculate() {
        return value;
    }
}
