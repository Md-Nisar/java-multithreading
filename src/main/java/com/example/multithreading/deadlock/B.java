package com.example.multithreading.deadlock;

public class B {

    public synchronized void d1(A a) {
        System.out.println("Child starts executing d1");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.last();
    }

    public synchronized void last() {
        System.out.println("B last()");
    }
}
