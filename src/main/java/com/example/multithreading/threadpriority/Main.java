package com.example.multithreading.threadpriority;

public class Main {

    public static void main(String[] args) {

        /*
        1. Thread priority defines order of execution of thread.
        2. The Default priority of main thread is 5 and default priority of other thread
            is inherited from parent thread
         */
        System.out.println("ThreadGroupDemo Thread Priority: " + Thread.currentThread().getPriority());

        MyThread myThread = new MyThread();
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("In ThreadGroupDemo Thread");
        }

    }
}
