package designpatterns.patterns.creational.abstractfactory.factories;

import designpatterns.patterns.creational.abstractfactory.factories.products.Button;
import designpatterns.patterns.creational.abstractfactory.factories.products.OSXButton;
import designpatterns.patterns.creational.abstractfactory.factories.products.OSXTextBox;
import designpatterns.patterns.creational.abstractfactory.factories.products.TextBox;

public class OSXFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new OSXButton();
    }

    @Override
    public TextBox createTextBox() {
        return new OSXTextBox();
    }
}
