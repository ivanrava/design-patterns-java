package designpatterns.patterns.structural.composite._object.uniformity;

public class CompositeUniformityRunner implements Runnable {
    @Override
    public void run() {
        Component expression = new Composite();
        Component subExpr = new Composite();
        subExpr.add(new Leaf(1));
        subExpr.add(new Leaf(2));
        subExpr.add(new Leaf(3));
        expression.add(new Leaf(4));
        expression.add(subExpr);
        // 4 + (1 + 2 + 3) = 10
        System.out.println(expression.calculate());
    }
}
