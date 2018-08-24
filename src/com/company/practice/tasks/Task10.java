package com.company.practice.tasks;

public class Task10 {
    public static void main(String[] args) {
        double matrix[] = {1.386, 5.125, 0.0, 9.22, -6.21, -85.12, -7.3222, 0.0, 0.12, 56.12, -9.1, -5.12, 45.14, 0.1, 18.145, 14.14, 16.12};
        double max = matrix[0], min = matrix[0];
        int maxindex = 0, minindex = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] >= max) {
                max = matrix[i];
                maxindex = i;
            }
            if (matrix[i] <= min) {
                min = matrix[i];
                minindex = i;
            }
        }
        printMatrix(matrix);
        System.out.println("Min:    " + min + "\nMax:   " + max);
        System.out.println("***Swapping***");
        swap(matrix, minindex, maxindex);
        printMatrix(matrix);
    }

    public static void printMatrix(double matrix[]) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
        System.out.println();
    }

    public static void swap(double matrix[], int firstindex, int secondindex) {
        double tmp = matrix[firstindex];
        matrix[firstindex] = matrix[secondindex];
        matrix[secondindex] = tmp;
    }
}
