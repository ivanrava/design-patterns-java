package designpatterns.patterns.creational.abstractfactory.factories;

import designpatterns.patterns.creational.abstractfactory.factories.products.Button;
import designpatterns.patterns.creational.abstractfactory.factories.products.TextBox;
import designpatterns.patterns.creational.abstractfactory.factories.products.WindowsButton;
import designpatterns.patterns.creational.abstractfactory.factories.products.WindowsTextBox;

public class WindowsFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
