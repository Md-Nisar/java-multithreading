package com.example.multithreading.synchronization.jointaccount;

import com.example.multithreading.synchronization.jointaccount.services.JointAccount;
import com.example.multithreading.synchronization.jointaccount.threads.HusbandThread;
import com.example.multithreading.synchronization.jointaccount.threads.WifeThread;

public class Main {

    public static void main(String[] args) {

        /*
        Data consistency problem
         */
        JointAccount jointAccount = new JointAccount();

        //Wife withdrawing 7000
        WifeThread wifeThread = new WifeThread(jointAccount, 7000.00);
        wifeThread.setName("Wife Thread");
        wifeThread.start();

        //Husband withdrawing 5000
        HusbandThread husbandThread = new HusbandThread(jointAccount, 5000.00);
        husbandThread.setName("Husband Thread");
        husbandThread.start();

        System.out.println("--- In ".concat(Thread.currentThread().getName()).concat(" ---"));

    }
}
