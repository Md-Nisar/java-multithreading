package com.example.multithreading.synchronization.jointaccount.services;

import com.example.multithreading.synchronization.jointaccount.exceptions.InsufficientFundException;

public class JointAccount {

    private double balance = 10000.00;
    public double checkBalance() {
        return this.balance;
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            balance -= amount;
            throw new InsufficientFundException("Available Balance: ", checkBalance());
        }
        balance -= amount;
    }
}
