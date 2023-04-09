package com.example.multithreading.threadcommunication.waitnotify;

public class ThreadB extends Thread {

    public int total = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            this.notify();
        }
        // 1 Million lines of code
    }
}
