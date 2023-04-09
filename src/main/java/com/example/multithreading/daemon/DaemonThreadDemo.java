package com.example.multithreading.daemon;

public class DaemonThreadDemo {

    public static void main(String[] args) {

        System.out.println("main Thread Nature: " + Thread.currentThread().isDaemon()); // false
       // Thread.currentThread().setDaemon(true); // throws RE: IllegalThreadStateException

        Thread childThread = new Thread(() -> {
            for (int i = 1; i <= 10 ; i++) {
                System.out.println("In Child Thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        /*
        Daemon threads get terminated once last Non-Daemon thread terminates
         */
        childThread.setDaemon(true); // true
        System.out.println("child Thread Nature: " + childThread.isDaemon());
        childThread.start();

        System.out.println("In main Thread");
    }
}
