package designpatterns.patterns.structural.proxy;

public class ProxyImage implements Image {
    RealImage realImage;
    private final String name;

    public ProxyImage(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(name);
        }
        realImage.display();
    }
}
