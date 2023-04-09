package com.example.multithreading.threadprevention.yield;

public class Main {

    public static void main(String[] args) {


        MyThread myThread = new MyThread();
        myThread.setPriority(8);
        myThread.start();


        for (int i = 1; i <= 1000 ; i++) {
            System.out.println("In ThreadGroupDemo Thread");
            /*
            1. yield() method is used to pause the execution of current thread and to give chance of
            execution to other threads of same priority or high
            2. It used when a thread has more code of execution then it's recommended to pass
            execution to other thread
             */
            Thread.yield();
        }
    }
}
