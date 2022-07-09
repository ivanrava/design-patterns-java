package designpatterns.patterns.creational.abstractfactory.factories;

import designpatterns.patterns.creational.abstractfactory.factories.products.Button;
import designpatterns.patterns.creational.abstractfactory.factories.products.TextBox;

public interface AbstractFactory {
    Button createButton();
    TextBox createTextBox();
}
