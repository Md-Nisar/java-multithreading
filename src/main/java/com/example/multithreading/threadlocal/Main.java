package com.example.multithreading.threadlocal;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------< Main thread >-----------");
        ThreadLocal threadLocal = new ThreadLocal();
        System.out.println(threadLocal.get()); // null
        threadLocal.set("abcd");
        System.out.println(threadLocal.get()); // abcd
        threadLocal.remove();
        System.out.println(threadLocal.get()); // null

        System.out.println("---------< Customer threads >-----------");
        Customer c1 = new Customer("Steve");
        Customer c2 = new Customer("Tony");
        Customer c3 = new Customer("Peter");
        Customer c4 = new Customer("Stephen");

        c1.start();
        c2.start();
        c3.start();
        c4.start();

    }
}
