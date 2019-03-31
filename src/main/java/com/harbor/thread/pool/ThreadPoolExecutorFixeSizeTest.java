package com.harbor.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by HLuo on 3/30/2019.
 */
public class ThreadPoolExecutorFixeSizeTest {

    public static void main(String[] args) {

        int availableProcessors = Runtime.getRuntime().availableProcessors();

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(availableProcessors);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        System.out.println("Done");
    }

}
