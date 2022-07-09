package designpatterns.patterns.structural.adapter._object;

import java.util.Arrays;

public class AdapterObjectRunner implements Runnable {
    @Override
    public void run() {
        SortListAdapter sortListAdapter = new SortListAdapter();
        System.out.println(Arrays.toString(
                sortListAdapter.sort(new Integer[]{7, 8, 9, 1, 2, 3}))
        );
    }
}
