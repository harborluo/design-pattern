package com.harbor.thread.pool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by HLuo on 3/30/2019.
 */
public class ScheduledExecutorServiceTest {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        for (int i=0;i<10; i++) {
            scheduledThreadPool.schedule(new Runnable() {
                public void run() {
                    System.out.println(new Date() + " delay 3 seconds");
                }
            }, 1, TimeUnit.SECONDS);

        }

        scheduledThreadPool.shutdown();

        System.out.println( new Date() + " Done");

    }


}
