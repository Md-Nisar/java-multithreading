package com.example.multithreading.runnable;

public class Main {

    public static void main(String[] args) {

        /*
        2. Define a Thread by Implementing Runnable Interface
         */
        Runnable target = new MyThread();
        Thread thread = new Thread(target);
        thread.start();

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("In ThreadGroupDemo Thread");
        }
    }
}
