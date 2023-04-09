package com.example.multithreading.synchronization.display.threads;

import com.example.multithreading.synchronization.display.services.Display;

public class AlphabetThread extends Thread{

    @Override
    public void run() {
        Display.displayAlphabets();
    }
}
