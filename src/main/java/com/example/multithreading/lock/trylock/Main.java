package com.example.multithreading.lock.trylock;

public class Main {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");
        t1.start();
        t2.start();
    }
}
