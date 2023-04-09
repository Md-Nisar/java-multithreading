package com.example.multithreading.threadprevention.join;

public class WeddingCardDistributeThread extends Thread {

    public static WeddingCardPrintThread weddingCardPrintThread;

    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            try {
                /*
                 Wait until cards are printed and then join/resume execution after
                 WeddingCardPrintThread completes its execution
                 */
                weddingCardPrintThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Distributing wedding cards");
        }
    }
}
