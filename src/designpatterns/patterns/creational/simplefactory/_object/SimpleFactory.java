package designpatterns.patterns.creational.simplefactory._object;

public class SimpleFactory {
    AbstractProduct createProduct(String name) throws Exception {
        return switch (name) {
            case "nail" -> new Nail();
            case "screw" -> new Screw();
            default -> throw new Exception("Wrong name");
        };
    }
}
