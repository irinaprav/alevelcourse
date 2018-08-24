package com.company.hometask.arithmeticprogression;

import java.util.Scanner;

public class ArithmeticProgressionDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter initial value:");
            int initial = in.nextInt();
            System.out.println("Enter step:");
            int step = in.nextInt();
            System.out.println("Enter N:");
            int n = in.nextInt();
            try {
                System.out.println(new ArithmeticProgression(initial, step).calculate(n));
            } catch (ProgressionConfigurationException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}