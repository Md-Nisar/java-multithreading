package com.example.multithreading.threadcommunication.notifyall;

public class Hello {

    String msg = "";
    public void sayHello() {
        System.out.println(Thread.currentThread().getName().concat(" got notified"));
        this.msg = this.msg + Thread.currentThread().getName();
    }

    public void setMsgPrefix(String prefix) {
        this.msg = this.msg + prefix;

    }
}
