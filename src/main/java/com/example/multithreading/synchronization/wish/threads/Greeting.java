package com.example.multithreading.synchronization.wish.threads;

public class Greeting {

    /*
     Synchronized functionality or method: Only one thread is allowed to execute
     sync functionality at one time. The other thread are not allowed to execute any synchronized
     functionality in this object but are allowed to execute any non-synchronized functionality happily.
     */
    public synchronized void wish(String name) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.print("Good Morning: ");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);

        }
    }

}
