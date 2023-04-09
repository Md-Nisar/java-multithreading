package com.example.multithreading.threadmethods;

public class Main {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("----- In ".concat(Thread.currentThread().getName()).concat(" ------"));

    }
}
