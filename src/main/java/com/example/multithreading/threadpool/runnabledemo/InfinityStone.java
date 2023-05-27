package com.example.multithreading.threadpool.runnabledemo;

public class InfinityStone implements Runnable {

    private final String taskName;

    InfinityStone(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " performing task : " + taskName);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
