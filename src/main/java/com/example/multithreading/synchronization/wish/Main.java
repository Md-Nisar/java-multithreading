package com.example.multithreading.synchronization.wish;

import com.example.multithreading.synchronization.wish.services.MyThread;
import com.example.multithreading.synchronization.wish.threads.Greeting;

public class Main {

    public static void main(String[] args) {

        /*
        Resolving Data Inconsistency problem using synchronization
         */
        Greeting greeting = new Greeting();

        MyThread thread1 = new MyThread(greeting, "Dhoni");
        MyThread thread2 = new MyThread(greeting, "Yuvraj");
        thread1.start();
        thread2.start();

        System.out.println("--- In ".concat(Thread.currentThread().getName()).concat(" ---"));
    }
}
