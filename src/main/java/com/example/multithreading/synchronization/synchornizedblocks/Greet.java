package com.example.multithreading.synchronization.synchornizedblocks;

public class Greet {

    public void greet(String name) {

        // 1000 lines of code above which need not be synchronized

        synchronized (this) {
            for (int i = 1; i <= 10 ; i++) {
                System.out.print("Hello, ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name);
            }
        }

        // 1000 lines of code below which need not be synchronized

    }
}
