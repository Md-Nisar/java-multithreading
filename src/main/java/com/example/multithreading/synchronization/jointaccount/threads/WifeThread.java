package com.example.multithreading.synchronization.jointaccount.threads;

import com.example.multithreading.synchronization.jointaccount.services.JointAccount;

public class WifeThread extends  Thread{

    private JointAccount jointAccount;
    private double amount;


    public WifeThread(JointAccount jointAccount, double amount) {
        this.jointAccount = jointAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("--- In ".concat(Thread.currentThread().getName()).concat(" ---"));
        this.jointAccount.withdraw(this.amount);
    }
}
