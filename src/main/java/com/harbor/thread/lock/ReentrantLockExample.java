package com.harbor.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by HLuo on 3/31/2019.
 */
public class ReentrantLockExample {

     static int cnt = 0;

     Lock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

//        ReentrantLockExample example = new ReentrantLockExample();

       for( int i=0;i<3;i++) {
           new Thread(() -> {
               ReentrantLockExample example = new ReentrantLockExample();
               example.add();
           }).start();
       }

        Thread.sleep(1000);

        System.out.println(ReentrantLockExample.cnt);

    }

    public  void add(){

        try {
            lock.lock();
            for (int i = 0; i < 10000; i++) {
                cnt++;
            }
        }finally {
            lock.unlock();
        }


/*
        synchronized (this){
            for (int i = 0; i < 10000; i++) {
                cnt++;
            }
        }
*/
        System.out.println(Thread.currentThread().getName()+ " done");
    }

}
