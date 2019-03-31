package com.harbor.thread;

/**
 * Created by HLuo on 3/31/2019.
 */
public class ValotileExample {

     volatile boolean stop = false;

    public void doSomething(){
        System.out.println("running...");
        while (!stop){

        }
        System.out.println("done.");
    }

    public void shutdown(){
        stop  = true;
    }

    public static void main(String[] args) {

        ValotileExample example = new ValotileExample();

        new Thread(()->{
            example.doSomething();
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            example.shutdown();
        }).start();

//        ValotileExample example2 = new ValotileExample();
//
//        new Thread(()->{
//            example2.shutdown();
//        }).start();



    }


}
