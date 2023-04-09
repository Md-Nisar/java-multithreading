package com.example.multithreading.threadprevention.sleep;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Slide - " + i);
            try {
                /*
            1. sleep() method is used to pause the execution of current thread for
            specified amount of time
            2. Ex: Slide Show
             */
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
