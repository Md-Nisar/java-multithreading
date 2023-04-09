package com.example.multithreading.synchronization.jointaccount.exceptions;

public class InsufficientFundException extends  RuntimeException{

    public InsufficientFundException(String message, double balance) {
        super(message.concat(String.valueOf(balance)));
    }
}
