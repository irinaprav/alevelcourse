package com.company.practice.tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int matrix[] = {1, 5, 9, -6, -85, -7, 56, -9, -5, 45, 18, 14, 16};
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] % k == 0) {
                sum = sum + matrix[i];
            }
        }
        System.out.println("Summary = " + sum);
    }
}
