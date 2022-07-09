package designpatterns.patterns.structural.composite._object.typesafety;

public class CompositeTypeSafetyRunner implements Runnable {
    @Override
    public void run() {
        Composite tree = new Composite();
        tree.add(new Leaf(1));
        tree.add(new Leaf(2));
        tree.add(new Leaf(3));
        // Better with degenerate trees
        System.out.println(tree.calculate());
    }
}
