package com.chongyu.concurrency;

public class MyThread extends Thread {

    @Override
    public void run(){

        try {
            sleep(5000);
            System.out.println("Hello from MyThread!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
