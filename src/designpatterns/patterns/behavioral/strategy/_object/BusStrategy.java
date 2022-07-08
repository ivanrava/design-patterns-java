package designpatterns.patterns.behavioral.strategy._object;

public class BusStrategy implements Strategy {
    @Override
    public int cost() {
        return 2;
    }

    @Override
    public int speed() {
        return 5;
    }
}
