package designpatterns.patterns.behavioral.strategy._object;

public class StrategyRunner implements Runnable {
    @Override
    public void run() {
        Strategy strategy = new BusStrategy();
        System.out.println(strategy.cost());
        System.out.println(strategy.speed());
    }
}
