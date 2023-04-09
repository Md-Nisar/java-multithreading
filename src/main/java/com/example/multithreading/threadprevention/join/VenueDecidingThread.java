package com.example.multithreading.threadprevention.join;

public class VenueDecidingThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println("Deciding venue for wedding");
        }
    }
}
