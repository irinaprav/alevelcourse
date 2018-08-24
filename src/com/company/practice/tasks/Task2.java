package com.company.practice.tasks;

public class Task2 {
    public static void main(String[] args) {
        int matrix[] = {1, 5, 0, 9, -6, -85, -7, 0, 56, -9, -5, 45, 0, 18, 14, 16};
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == 0) {
                count++;
            }
        }
        int zeropositions[] = zeroInMatrix(matrix, count);
        if (zeropositions.length > 0) {
            System.out.println("Zero positions: ");
            printMatrix(zeropositions);
        } else {
            System.out.println("There is no 0 elements");
        }
    }

    public static int[] zeroInMatrix(int matrix[], int count) {
        int[] zeropositions = new int[count];
        int position = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == 0) {
                zeropositions[position] = i;
                position++;
            }
        }
        return zeropositions;
    }

    public static void printMatrix(int matrix[]) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
        System.out.println();
    }
}
