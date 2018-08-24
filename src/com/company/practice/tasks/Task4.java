package com.company.practice.tasks;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        double matrix[] = {1.386, 5.125, 0.0, 9.22, -6.21, -85.12, -7.3222, 0.0, 0.12, 56.12, -9.1, -5.12, 45.14, 0.1, 18.145, 14.14, 16.12};
        System.out.println("Increasing? " + increasingMatrix(matrix));
        Arrays.sort(matrix);
        System.out.println("And now? " + increasingMatrix(matrix));
    }

    private static boolean increasingMatrix(double matrix[]) {
        boolean increasing = true;
        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i] > matrix[i + 1]) {
                increasing = false;
                break;
            }
        }
        return increasing;
    }
}
