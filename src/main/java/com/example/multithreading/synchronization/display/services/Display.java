package com.example.multithreading.synchronization.display.services;

public class Display {

    private Display() {

    }

    public static synchronized void displayNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void displayAlphabets() {
        for (int i = 65; i <= 75; i++) {
            System.out.print((char)i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
