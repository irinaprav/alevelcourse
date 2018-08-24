package com.company.practice.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int matrix[] = {0, 5, 0, 9, 6, 85, 7, 0, 56, 9, 5, 45, 0, 18, 14, 16};
        Scanner in = new Scanner(System.in);
        int L = -1000, M = -1000;
        while ((L <= 0) && (M <= 0) && (L >= M - 1)) {
            System.out.println("Enter L:");
            L = in.nextInt();
            System.out.println("Enter M:");
            M = in.nextInt();
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] % M == L) {
                System.out.print(matrix[i] + " ");
            }
        }
    }
}
