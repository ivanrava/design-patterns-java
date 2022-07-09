package designpatterns.patterns.structural.adapter._object;

import java.util.Arrays;

public class SortListAdapter implements ISortAdapter {
    @Override
    public Integer[] sort(Integer[] numbers) {
        ListSorter listSorter = new ListSorter();
        return listSorter.sort(Arrays.asList(numbers)).toArray(new Integer[0]);
    }
}
