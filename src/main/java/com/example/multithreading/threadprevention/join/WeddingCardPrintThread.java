package com.example.multithreading.threadprevention.join;

public class WeddingCardPrintThread extends Thread {

    public static VenueDecidingThread venueDecidingThread;

    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            try {
                /*
                 Wait until venue is decided and then join/resume execution after
                 venueDecidingThread completes its execution
                 */
                venueDecidingThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Printing wedding cards");
        }
    }
}
