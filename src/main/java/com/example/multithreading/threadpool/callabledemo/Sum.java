package com.example.multithreading.threadpool.callabledemo;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {

    private final int n;
    private int sum = 0;

    public Sum(int n) {
        this.n = n;
    }

    @Override
    public Integer call() {
        System.out.println(Thread.currentThread().getName() + " calculating sum of first " + n + " numbers");
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sum;
    }
}
