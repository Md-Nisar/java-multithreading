package com.example.multithreading.deadlock;

public class A {

    public synchronized void d1(B b) {
        System.out.println("ThreadGroupDemo starts executing d1");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      b.last();
    }

    public synchronized void last() {
        System.out.println("A last()");

    }
}
