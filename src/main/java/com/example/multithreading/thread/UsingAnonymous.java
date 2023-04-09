package com.example.multithreading.thread;

public class UsingAnonymous {

    public static void main(String[] args) {

        /*
        Thread creation using Anonymous Inner Class
         */
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("In Child Thread");
            }
        };

        thread.start();
        System.out.println("In ThreadGroupDemo Thread");
    }
}
