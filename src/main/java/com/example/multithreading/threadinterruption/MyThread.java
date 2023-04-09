package com.example.multithreading.threadinterruption;

public class MyThread extends Thread {

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Slide - " + i);
                //Thread.sleep(2000);
            }
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("I got Interrupted!");
        }
    }
}

