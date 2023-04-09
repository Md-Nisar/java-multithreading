package com.example.multithreading.threadprevention.sleep;

public class Main {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
    }
}
