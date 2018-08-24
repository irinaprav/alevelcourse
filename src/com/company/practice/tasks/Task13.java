package com.company.practice.tasks;

public class Task13 {
    public static void main(String[] args) {
        int matrix[] = {0, 5, 0, 9, -6, -85, -7, 0, 56, -9, -5, 45, 0, 18, 14, 16};
        System.out.println("Matrix:");
        printMatrix(matrix);
        changeElements(matrix);
        System.out.println("Changed Matrix:");
        printMatrix(matrix);
    }

    public static void printMatrix(int matrix[]) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
        System.out.println();
    }

    public static void changeElements(int matrix[]) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                int tmp = matrix[i];
                matrix[i] = matrix[i + 1];
                matrix[i + 1] = tmp;
            }
        }
    }

}
