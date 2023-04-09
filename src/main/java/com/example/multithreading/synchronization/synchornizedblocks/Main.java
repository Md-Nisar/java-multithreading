package com.example.multithreading.synchronization.synchornizedblocks;

public class Main {

    public static void main(String[] args) {

        /*
        Synchronized block demo to improve performance
         */
        Greet greet = new Greet();

        Runnable runnable1 = new MyThread(greet, "Rohit");
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Runnable runnable2 = new MyThread(greet, "Virat");
        Thread thread2 = new Thread(runnable2);
        thread2.start();

        System.out.println("--- In ThreadGroupDemo".concat(Thread.currentThread().getName()).concat(" ---"));


    }
}
