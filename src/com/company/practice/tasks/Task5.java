package com.company.practice.tasks;

public class Task5 {
    public static void main(String[] args) {
        int matrix[] = {0, 5, 0, 9, 6, 85, 7, 0, 56, 9, 5, 45, 0, 18, 14, 16};
        System.out.println("Matrix:");
        printMatrix(matrix);
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] % 2 == 0) {
                count++;
            }
        }
        int even[] = evenInMatrix(matrix, count);
        if (even.length == 0) {
            System.out.println("There is no even elements!");
        } else {
            System.out.println("Even elements:");
            printMatrix(even);
        }
    }

    public static int[] evenInMatrix(int matrix[], int count) {
        int even[] = new int[count];
        int position = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] % 2 == 0) {
                even[position] = matrix[i];
                position++;
            }
        }
        return even;
    }

    public static void printMatrix(int matrix[]) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
        System.out.println();
    }
}
