package com.chongyu.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Concurrency {

    public static void main(String[] args) {
        /*
        MyThread myThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();

        myThread.start();
        new Thread(myRunnable).start();
        */

        /*
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous Runnable!");
            }
        };

        new Thread(task).start();
        */

        /*
        Runnable task = () -> System.out.println("Hello from lambda Runnable!");

        new Thread(task).start();
        */

        /*
        ExecutorService executor = Executors.newSingleThreadExecutor();

        try {
            executor.submit(() -> System.out.println("Hello from ExecutorService!"));

            executor.shutdown();

            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        } finally {
            if (!executor.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executor.shutdownNow();
            System.out.println("shutdown finished");
        }
        */


    }

}
