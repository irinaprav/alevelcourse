package com.company.practice.tasks;

import java.util.Scanner;

public class Task7 {
    private static int contsofchanges = 0;

    public static void main(String[] args) {
        double matrix[] = {1.386, 5.125, 0.0, 9.22, -6.21, -85.12, -7.3222, 0.12, 56.12, -9.1, -5.12, 45.14, 0.1, 18.145, 14.14, 16.12};
        Scanner in = new Scanner(System.in);
        double z = in.nextDouble();
        printMatrix(matrix);
        changeElements(matrix, z);
        printMatrix(matrix);
        System.out.println("Count of changes : " + contsofchanges);
    }

    public static void changeElements(double matrix[], double z) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] > z) {
                matrix[i] = z;
                contsofchanges++;
            }
        }
    }

    public static void printMatrix(double matrix[]) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
        System.out.println();
    }
}
