package com.example.multithreading.synchronization.synchornizedblocks;

public class MyThread implements Runnable{

    private final Greet greet;
    private final String name;

    public MyThread(Greet greet, String name) {
        this.greet = greet;
        this.name = name;
    }

    @Override
    public void run() {
        this.greet.greet(name);
    }
}
