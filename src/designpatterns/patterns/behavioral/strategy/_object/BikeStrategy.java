package designpatterns.patterns.behavioral.strategy._object;

public class BikeStrategy implements Strategy {
    @Override
    public int cost() {
        return 0;
    }

    @Override
    public int speed() {
        return 2;
    }
}
