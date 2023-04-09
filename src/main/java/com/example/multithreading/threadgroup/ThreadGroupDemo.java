package com.example.multithreading.threadgroup;

public class ThreadGroupDemo {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getThreadGroup()); // java.lang.ThreadGroup[name=main,maxpri=10]
        System.out.println(Thread.currentThread().getThreadGroup().getName()); // main
        System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority()); // 10
        System.out.println("--------------");

        System.out.println(Thread.currentThread().getThreadGroup().getParent()); // java.lang.ThreadGroup[name=system,maxpri=10]
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); // system
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getMaxPriority()); // 10
        System.out.println("--------------");

        ThreadGroup ptg = new ThreadGroup("parent");
        System.out.println(ptg);
        System.out.println(ptg.getName());
        System.out.println(ptg.getMaxPriority());
        System.out.println("--------------");

        ThreadGroup ctg = new ThreadGroup(ptg, "child");
        System.out.println(ctg);
        System.out.println(ctg.getName());
        System.out.println(ctg.getMaxPriority());
        System.out.println("--------------");


    }
}
