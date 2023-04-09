package com.example.multithreading.synchronization.wish.services;

import com.example.multithreading.synchronization.wish.threads.Greeting;

public class MyThread extends  Thread{

    private final Greeting greeting;
    private final String name;


    public MyThread(Greeting greeting, String name) {
        this.greeting = greeting;
        this.name = name;
    }

    @Override
    public void run() {
        this.greeting.wish(this.name);
    }
}
