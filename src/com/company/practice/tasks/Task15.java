package com.company.practice.tasks;

public class Task15 {
    public static void main(String[] args) {
        int matrix[] = {20, 5, 10, 9, -6, -85, -7, 0, 56, -9, -5, 45, 40, 18, 14, 16};
        int position = -1;
        System.out.println("Sequence by zero:");
        do {
            position++;
            System.out.print(matrix[position] + " ");
        } while (matrix[position] != 0);
    }
}
