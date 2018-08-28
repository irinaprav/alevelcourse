package com.company.hometask.threads;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        InputMessage message = new InputMessage("something");
        MyThread t = new MyThread(message);
        t.start();
        Scanner in = new Scanner(System.in);
        while (true) {
            synchronized (message) {
                try {
                    System.out.println("Enter new word:");
                    String n = in.next();
                    message.setMessage(n);
                    if (!t.isAlive() || (message.getMessage().equals("quit"))) break;
                    message.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(t.getRepository());
    }
}
