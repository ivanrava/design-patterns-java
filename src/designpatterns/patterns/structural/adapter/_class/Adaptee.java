package designpatterns.patterns.structural.adapter._class;

import java.util.List;

public class Adaptee {
    public List<Integer> sort(List<Integer> numbers) {
        numbers.sort(Integer::compareTo);
        return numbers;
    }
}
