package com.company.practice.tasks;

public class Task16 {
    public static void main(String[] args) {
        int matrix[] = {20, 5, 10, 9, -6, -85, -7, 0, 56, -9, -5, 45, 40, 18, 14, 16};
        int position = matrix.length / 2 - 1;
        for (int i = 0; i <= matrix.length / 2 - 1; i++) {
            position++;
            System.out.println("X: " + matrix[i] + "; Y: " + matrix[position]);
        }
    }
}
