package com.example.multithreading.lock.trylock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    private static final ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {

        do {
            try {
                if(lock.tryLock(5000, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName() + " got the LOCK and performing safe operations...");
                    Thread.sleep(30000);
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName() + " released the LOCK!");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + " didn't get the LOCK and will try again!");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } while (true);
    }
}
