package designpatterns.patterns.structural._object.adapter;

import java.util.Arrays;

public class AdapterObjectRunner implements Runnable {
    @Override
    public void run() {
        Adapter sortAdapter = new Adapter();
        System.out.println(Arrays.toString(
                sortAdapter.sort(new Integer[]{7, 8, 9, 1, 2, 3}))
        );
    }
}
