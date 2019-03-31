package com.harbor.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by HLuo on 3/31/2019.
 */
public class VolatileBadExample {

     static volatile boolean start = false;

    public void doSomething(){
        if (start){
            throw new RuntimeException("VolatileBadExample already started");
        }
        start = true;
        System.out.println("started.");

    }

    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newScheduledThreadPool(1000);

        for (int i=0;i<1000;i++) {
            fixedThreadPool.execute(() -> {
                VolatileBadExample example = new VolatileBadExample();
                example.doSomething();
            });
        }

        fixedThreadPool.shutdown();
    }

}
