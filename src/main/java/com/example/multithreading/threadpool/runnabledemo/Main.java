package com.example.multithreading.threadpool.runnabledemo;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        InfinityStone[] tasks = {
                new InfinityStone("Find Mind Stone"),
                new InfinityStone("Find Soul Stone"),
                new InfinityStone("Find Power Stone"),
                new InfinityStone("Find Space Stone"),
                new InfinityStone("Find Reality Stone"),
                new InfinityStone("Find Time Stone")

        };
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (Runnable task : tasks) {
            service.submit(task);
        }
        service.shutdown();
    }

}
