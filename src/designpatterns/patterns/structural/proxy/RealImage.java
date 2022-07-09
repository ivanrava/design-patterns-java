package designpatterns.patterns.structural.proxy;

public class RealImage implements Image {
    private final String name;

    public RealImage(String name) {
        this.name = name;
        this.load();
    }

    private void load() {
        System.out.println("Loading " + name);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + name);
    }
}
