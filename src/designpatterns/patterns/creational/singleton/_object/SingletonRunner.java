package designpatterns.patterns.creational.singleton._object;

public class SingletonRunner implements Runnable {
    @Override
    public void run() {
        System.out.println(
                Singleton.getInstance()
        );
    }
}
