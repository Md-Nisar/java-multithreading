package com.example.multithreading.threadlocal;

public class Customer extends Thread {

    private static int customerId = 0;
    private static final ThreadLocal<Integer> threadLocal = new ThreadLocal() {
        @Override
        public Integer initialValue() {
            return ++customerId;
        }
    };

    public Customer(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Thread running with Id: " + threadLocal.get());
    }
}
