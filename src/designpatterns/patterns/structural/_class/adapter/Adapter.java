package designpatterns.patterns.structural._class.adapter;

import java.util.Arrays;

public class Adapter extends Adaptee implements Target {
    @Override
    public Integer[] sort(Integer[] numbers) {
        return super.sort(Arrays.asList(numbers)).toArray(new Integer[0]);
    }
}
