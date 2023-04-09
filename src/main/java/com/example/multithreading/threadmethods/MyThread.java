package com.example.multithreading.threadmethods;

public class MyThread extends  Thread{

    @Override
    public void run() {
        System.out.println("----- In ".concat(Thread.currentThread().getName()).concat(" ------"));
        System.out.println("Current Thread: "+ Thread.currentThread());
        System.out.println("Thread ID: "+ Thread.currentThread().getId());
        System.out.println("Thread State: "+ Thread.currentThread().getState());
        System.out.println("Thread Priority: "+ Thread.currentThread().getPriority());
        System.out.println("Thread Group" + Thread.currentThread().getThreadGroup());
        System.out.println("Thread Context Class loader: "+ Thread.currentThread().getContextClassLoader());
        System.out.println("Is Alive: "+Thread.currentThread().isAlive());
        System.out.println("Is Daemon: "+ Thread.currentThread().isDaemon());
        System.out.println("Is Interrupted: "+ Thread.currentThread().isInterrupted());
    }
}
