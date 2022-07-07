package designpatterns.patterns.creational.simplefactory._object;

import java.lang.reflect.InvocationTargetException;

public class Factory {
    AbstractProduct createType(String className) throws Exception {
        return (AbstractProduct) Class.forName(className).getDeclaredConstructor().newInstance();
    }
}
