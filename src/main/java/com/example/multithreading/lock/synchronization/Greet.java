package com.example.multithreading.lock.synchronization;

import java.util.concurrent.locks.ReentrantLock;

public class Greet extends Thread {

    private final ReentrantLock lock = new ReentrantLock();
    private final String name;
    public Greet(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 1; i <= 10 ; i++) {
            System.out.print("Good Afternoon, ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
        lock.unlock();
    }
}
