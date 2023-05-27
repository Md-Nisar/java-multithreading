package com.example.multithreading.threadpool.callabledemo;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Sum[] tasks = {
                new Sum(10),
                new Sum(25),
                new Sum(50),
                new Sum(75),
                new Sum(100),
        };
        ExecutorService service = Executors.newFixedThreadPool(4);
        for (Callable<Integer> task: tasks) {
            Future<Integer> result = service.submit(task);
            System.out.println("Result: " + result.get());
        }
    }
}
