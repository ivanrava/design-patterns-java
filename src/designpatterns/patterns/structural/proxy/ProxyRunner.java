package designpatterns.patterns.structural.proxy;

public class ProxyRunner implements Runnable {
    @Override
    public void run() {
        Image img1 = new ProxyImage("IMG_1");
        Image img2 = new ProxyImage("IMG_2");

        img1.display();
        img1.display();
        img1.display();
        img1.display();
        img2.display();
        img2.display();
        img2.display();
    }
}
