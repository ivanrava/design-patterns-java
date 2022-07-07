package designpatterns.patterns.structural._object.adapter;

import java.util.Arrays;

public class Adapter implements Target {
    @Override
    public Integer[] sort(Integer[] numbers) {
        Adaptee listSorter = new Adaptee();
        return listSorter.sort(Arrays.asList(numbers)).toArray(new Integer[0]);
    }
}
