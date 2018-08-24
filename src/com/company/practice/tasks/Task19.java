package com.company.practice.tasks;

public class Task19 {

    public static void main(String[] args) {
        int matrix[] = {20, 5, 10, 9, -6, -85, -7, 0, 56, -9, -5, 45, 40, 18, 14, 16, 25};
        int position = 0, power = 0;
        position = 1 << power;
        while (position < matrix.length) {
            System.out.print(matrix[position] + " ");
            power++;
            position = 1 << power;
        }
    }
}
