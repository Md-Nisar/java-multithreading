package com.example.multithreading.thread;

public class UsingLambda {

    public static void main(String[] args) {

        /*
        Thread creation using Lambda expression
         */
        Thread thread = new Thread(() -> System.out.println("In Child Thread"));
        thread.start();

        System.out.println("In ThreadGroupDemo Thread");
    }
}
