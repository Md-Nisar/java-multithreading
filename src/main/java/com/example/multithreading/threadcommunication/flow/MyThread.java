package com.example.multithreading.threadcommunication.flow;

public class MyThread extends Thread {

    CalculateSum calculateSum;

    MyThread(CalculateSum calculateSum) {
        this.calculateSum = calculateSum;
    }

    @Override
    public void run() {
       synchronized (calculateSum) {
           calculateSum.sumOfNumbers();
           System.out.println("Child Thread has done with calculation and calls notify() to notify waiting Thread");
           calculateSum.notify();
       }
    }
}
