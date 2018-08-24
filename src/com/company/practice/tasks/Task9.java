package com.company.practice.tasks;

public class Task9 {
    public static void main(String[] args) {
        double matrix[] = {1.386, 5.125, 0.0, 9.22, -6.21, -85.12, -7.3222, 0.0, 0.12, 56.12, -9.1, -5.12, 45.14, 0.1, 18.145, 14.14, 16.12};
        int countofzero = 0;
        int countofneg = 0;
        int countofpos = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] > 0) {
                countofpos++;
            } else if (matrix[i] == 0) {
                countofzero++;
            } else {
                countofneg++;
            }
        }
        System.out.println("Count of positive in sequence: " + countofpos + "\nCount of negative: " + countofneg + "\nCount of zero: " + countofzero);
    }
}
