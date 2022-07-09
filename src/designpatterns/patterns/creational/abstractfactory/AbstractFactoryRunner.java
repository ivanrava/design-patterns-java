package designpatterns.patterns.creational.abstractfactory;

import designpatterns.patterns.creational.abstractfactory.factories.*;

public class AbstractFactoryRunner implements Runnable {
    @Override
    public void run() {
        AbstractFactory factory = new WindowsFactory();
        System.out.println(factory.createButton());
        System.out.println(factory.createTextBox());
    }
}
