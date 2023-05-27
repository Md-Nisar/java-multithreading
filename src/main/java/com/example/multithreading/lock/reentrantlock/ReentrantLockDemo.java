package com.example.multithreading.lock.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();

        System.out.println(lock.isLocked()); // false
        System.out.println(lock.isFair()); //false
        System.out.println(lock.isHeldByCurrentThread()); //false
        System.out.println(lock.getHoldCount()); // 0

        System.out.println("-------------< main got the lock >-----------");

        lock.lock();
        lock.lock();
        System.out.println(lock.isLocked()); // true
        System.out.println(lock.isHeldByCurrentThread()); // true
        System.out.println(lock.getHoldCount()); // 2

        lock.unlock();
        System.out.println(lock.getHoldCount()); // 1
        System.out.println(lock.isLocked()); // true

        lock.unlock();
        System.out.println(lock.isLocked()); // false
        System.out.println(lock.getHoldCount()); // 0






    }
}
