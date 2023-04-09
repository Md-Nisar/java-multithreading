package com.example.multithreading.threadcommunication.notifyall;

public class MyThread extends Thread  {

    private Hello hello;

    MyThread(Hello hello) {
        this.hello = hello;
    }
    @Override
    public void run() {
        synchronized (hello) {
            try {
                System.out.println(Thread.currentThread().getName().concat(" goes into waiting state"));
                hello.wait();
                hello.sayHello();
                System.out.println(hello.msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

