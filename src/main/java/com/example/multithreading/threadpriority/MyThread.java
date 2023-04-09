package com.example.multithreading.threadpriority;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("Child Thread Priority: " + Thread.currentThread().getPriority());
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("In Child Thread");
        }
    }
}
