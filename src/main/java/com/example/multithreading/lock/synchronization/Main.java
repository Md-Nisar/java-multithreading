package com.example.multithreading.lock.synchronization;

public class Main {

    public static void main(String[] args) {

        Greet g1 = new Greet("Virat");
        Greet g2 = new Greet("Rohit");
        g1.start();
        g2.start();

    }
}
