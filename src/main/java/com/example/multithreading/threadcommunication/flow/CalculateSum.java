package com.example.multithreading.threadcommunication.flow;

public class CalculateSum {

    public int total = 0;

    public void sumOfNumbers() {
        System.out.println("Child Thread Calculating sum...");
        for (int i = 1; i <= 100 ; i++) {
            total = total + i;
        }
    }
}
