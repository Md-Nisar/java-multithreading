package com.example.multithreading.threadinterruption;

public class Main {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
        /*
        1. A Thread Interrupts another Thread using interrupt().
        2. This Call will wait until the target thread goes into Waiting/Sleeping state.
        3. If the target Thread never goes into Waiting/Sleeping state in its entire lifecycle,
         then this call is wasted.
         */
        myThread.interrupt();

        System.out.println("In ThreadGroupDemo");
    }
}
