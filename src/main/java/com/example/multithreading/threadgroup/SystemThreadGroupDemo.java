package com.example.multithreading.threadgroup;

public class SystemThreadGroupDemo {

    public static void main(String[] args) {

        // main Thread Group is the direct child of system Thread Group (root)
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();

        system.list();

        System.out.println("Active Threads count: "+ system.activeCount());
        System.out.println("Active Thread Groups count: "+ system.activeGroupCount());

        System.out.println("----Active Threads----");
        Thread[] threads = new Thread[system.activeCount()];
        system.enumerate(threads);
        for (Thread thread: threads) {
            System.out.println(thread.getName());
        }

        System.out.println("----Active Thread Group----");
        ThreadGroup[] threadGroups = new ThreadGroup[system.activeGroupCount()];
        system.enumerate(threadGroups);
        for (ThreadGroup threadGroup: threadGroups) {
            System.out.println(threadGroup.getName());
        }

    }
}
