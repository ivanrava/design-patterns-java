package designpatterns.patterns.behavioral.strategy._object;

public class TaxiStrategy implements Strategy {
    @Override
    public int cost() {
        return 5;
    }

    @Override
    public int speed() {
        return 10;
    }
}
