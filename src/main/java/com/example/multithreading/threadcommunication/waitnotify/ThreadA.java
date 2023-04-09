package com.example.multithreading.threadcommunication.waitnotify;

public class ThreadA {

    public static void main(String[] args) throws InterruptedException {

        ThreadB b = new ThreadB();
        b.start();

        /*
         Possible approaches (but not recommended) to get expected output i.e, 5050
         1. Thread.sleep(5000) -> Wastage of time
         2. b.join() -> main thread has to unnecessarily wait until child thread execution even though
          calculation is already completed
         */

        synchronized (b) {
            b.wait();
        }

        System.out.println(b.total);
    }
}
