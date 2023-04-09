package com.example.multithreading.threadprevention.join;

public class Main {

    public static void main(String[] args) {

        /* 1.join() method is used to pause the execution of current thread until some other
             thread completes its execution.
            2. It used when a thread has dependency on other thread
         */

        VenueDecidingThread venueDecidingThread = new VenueDecidingThread();
        venueDecidingThread.setPriority(Thread.MAX_PRIORITY);

        WeddingCardPrintThread.venueDecidingThread = venueDecidingThread;
        WeddingCardPrintThread weddingCardPrintThread = new WeddingCardPrintThread();
        weddingCardPrintThread.setPriority(Thread.NORM_PRIORITY);

        WeddingCardDistributeThread.weddingCardPrintThread = weddingCardPrintThread;
        WeddingCardDistributeThread weddingCardDistributeThread = new WeddingCardDistributeThread();
        weddingCardPrintThread.setPriority(Thread.MIN_PRIORITY);

        venueDecidingThread.start();
        weddingCardPrintThread.start();
        weddingCardDistributeThread.start();

        try {
            weddingCardDistributeThread.join();
            System.out.println("Happy wedding!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
