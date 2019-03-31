package com.harbor.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by HLuo on 3/30/2019.
 */
public class WaitTest {
    public static void main(String[] args){
        try {
//            new WaitTest().wait();
            Thread.sleep(60*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
