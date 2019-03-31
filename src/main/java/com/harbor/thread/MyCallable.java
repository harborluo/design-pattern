package com.harbor.thread;

import java.util.concurrent.*;

/**
 * Created by HLuo on 3/30/2019.
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "hello!";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask task = new FutureTask(new MyCallable());
        new Thread(task).start();
        System.out.println(task.get());

        ForkJoinPool pool;

    }
}
