package designpatterns.patterns.structural._class.adapter;

import java.util.List;

public class Adaptee {
    public List<Integer> sort(List<Integer> numbers) {
        numbers.sort(Integer::compareTo);
        return numbers;
    }
}
