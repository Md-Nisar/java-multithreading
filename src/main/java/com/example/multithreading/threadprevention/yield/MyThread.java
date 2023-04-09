package com.example.multithreading.threadprevention.yield;

public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 1 ; i <= 5 ; i++) {
            System.out.println("In Child Thread");
        }
    }
}
