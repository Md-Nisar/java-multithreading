package com.example.multithreading.deadlock;

public class Main {

    public void m1() {
        A a = new A();
        B b = new B();
        MyThread myThread = new MyThread(a, b);
        myThread.start();
        a.d1(b);
    }

    public static void main(String[] args) {

        /*
        Deadlock: When two threads wait for each other forever to complete the execution.
         */

        Main main = new Main();
        main.m1();

    }
}
