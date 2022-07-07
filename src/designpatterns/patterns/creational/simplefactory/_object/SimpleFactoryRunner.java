package designpatterns.patterns.creational.simplefactory._object;

public class SimpleFactoryRunner implements Runnable {
    @Override
    public void run() {
        SimpleFactory factory = new SimpleFactory();
        try {
            AbstractProduct product = factory.createProduct("designpatterns.patterns.creational.simplefactory._object.Nail");
            System.out.println(product.description());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
