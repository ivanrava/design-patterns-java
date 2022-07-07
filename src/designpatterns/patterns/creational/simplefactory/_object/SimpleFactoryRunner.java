package designpatterns.patterns.creational.simplefactory._object;

public class SimpleFactoryRunner implements Runnable {
    @Override
    public void run() {
        Factory factory = new Factory();
        try {
            AbstractProduct product = factory.createType("designpatterns.patterns.creational.simplefactory._object.Nail");
            System.out.println(product.description());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
