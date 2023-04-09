package com.example.multithreading.threadgroup;

public class ThreadGroupPriorityDemo {

    public static void main(String[] args) {

        ThreadGroup tg = new ThreadGroup("parent");
        System.out.println("Default priority: "+ tg.getMaxPriority());
        MyThread t1 = new MyThread(tg, "t1");
        t1.setPriority(5);
        MyThread t2 = new MyThread(tg, "t2");
        t2.setPriority(5);

        t1.start();
        t2.start();

        tg.setMaxPriority(3); // Priority for the existing threads remain same even though it's higher than max

        System.out.println("New priority: "+ tg.getMaxPriority());
        MyThread t3 = new MyThread(tg, "t3");
        t3.setPriority(3);

        t3.start();

        tg.list();




    }
}
