package com.example.multithreading.synchronization.display;

import com.example.multithreading.synchronization.display.threads.AlphabetThread;
import com.example.multithreading.synchronization.display.threads.NumberThread;

public class Main {

    public static void main(String[] args) {

        /*
        Static Synchronized method (Class level Lock) Demo
         */
        NumberThread numberThread = new NumberThread();
        AlphabetThread alphabetThread = new AlphabetThread();
        numberThread.start();
        alphabetThread.start();

        System.out.println("--- In ".concat(Thread.currentThread().getName()).concat(" ---"));



    }
}
