package com.company.practice.tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countinsequence = 0;
        double num = 100.0;
        do {
            num = in.nextDouble();
            if (num != 0.0) {
                countinsequence++;
            }
        } while (num != 0);
        System.out.println("Count in sequence " + countinsequence);
    }
}
