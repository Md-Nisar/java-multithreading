package com.example.multithreading.threadgroup;

public class ThreadGroupMethodsDemo {

    public static void main(String[] args) {

        ThreadGroup ptg = new ThreadGroup("parent");
        ThreadGroup ctg = new ThreadGroup(ptg,"child");
        MyThread t1 = new MyThread(ptg, "t1");
        MyThread t2 = new MyThread(ptg, "t2");
        t1.start();
        t2.start();


        System.out.println(ptg); // java.lang.ThreadGroup[name=parent,maxpri=10]
        System.out.println(ptg.getParent()); // java.lang.ThreadGroup[name=main,maxpri=10]
        System.out.println(ptg.getName()); // parent
        System.out.println(ptg.getMaxPriority()); // 10

        System.out.println(ptg.activeCount()); // 2
        System.out.println(ptg.activeGroupCount()); // 1

        System.out.println(ptg.isDaemon()); // false
        System.out.println(ptg.isDestroyed()); // false
        System.out.println(ptg.parentOf(ctg)); // true

        System.out.println("----Thread Info----");
        ptg.list();

        System.out.println("----Active Thread Groups----");
        ThreadGroup[] threadGroups = new ThreadGroup[ptg.activeGroupCount()];
        ptg.enumerate(threadGroups);
        for(ThreadGroup threadGroup: threadGroups) {
            System.out.println(threadGroup.getName());
        }

        System.out.println("----Active Threads----");
        Thread[] threads = new Thread[ptg.activeCount()];
        ptg.enumerate(threads);
        for(Thread thread: threads) {
            System.out.println(thread.getName());
        }

        ptg.interrupt(); // Interrupts all the active threads







    }
}
