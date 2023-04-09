package com.example.multithreading.threadgroup;

public class MyThread extends Thread{

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("::" + Thread.currentThread().getName().concat(" got interrupted::"));
        }
        System.out.println("In ".concat(Thread.currentThread().getName()));
    }
}
