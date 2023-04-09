package com.example.multithreading.deadlock;

public class MyThread extends  Thread{

    A a;
    B b;


    MyThread(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        b.d1(a);
    }
}
