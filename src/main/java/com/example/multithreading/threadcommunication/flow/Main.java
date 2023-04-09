package com.example.multithreading.threadcommunication.flow;

public class Main {

    public static void main(String[] args) throws InterruptedException {

      CalculateSum calculateSum = new CalculateSum();
      MyThread t = new MyThread(calculateSum);
      t.start();

      //Thread.sleep(3000); // Not giving first chance to main thread
      synchronized (calculateSum) {
          System.out.println("ThreadGroupDemo Thread calls wait(), releases lock and goes into the waiting stage");
          calculateSum.wait(3000); // Waiting time is required if Child Thread gets chance first
          System.out.println("Waiting time completed or main thread got notified and ThreadGroupDemo Thread is coming out of waiting stage");
          System.out.println(calculateSum.total);
      }
    }
}
