package com.example.multithreading.thread;

public class Main {

    public static void main(String[] args) {

        /*
        1. Define a Thread by extending Thread class
         */
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("In ThreadGroupDemo Thread");
        }
    }
}
