package designpatterns.patterns.structural.adapter._class;

import java.util.Arrays;

public class AdapterClassRunner implements Runnable {
    @Override
    public void run() {
        Target sortAdapter = new Adapter();
        System.out.println(Arrays.toString(
                sortAdapter.sort(new Integer[]{7, 8, 9, 1, 2, 3}))
        );
    }
}
