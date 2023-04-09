package com.example.multithreading.threadcommunication.notifyall;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Hello h1 = new Hello();

        MyThread t1 = new MyThread(h1);
        MyThread t2 = new MyThread(h1);
        MyThread t3 = new MyThread(h1);
        t1.start();
        t2.start();
        t3.start();



        Thread.sleep(5000);
        synchronized (h1) {
            h1.setMsgPrefix("Hello ");
            System.out.println("Notifying all the threads waiting on object's (h1) monitor");
            h1.notifyAll();
        }
    }
}
