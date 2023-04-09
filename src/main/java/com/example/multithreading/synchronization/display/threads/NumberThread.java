package com.example.multithreading.synchronization.display.threads;

import com.example.multithreading.synchronization.display.services.Display;

public class NumberThread extends Thread{

    @Override
    public void run() {
        Display.displayNumbers();
    }
}
