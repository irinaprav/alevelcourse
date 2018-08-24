package com.company.practice.tasks;

public class Task14 {
    public static void main(String[] args) {
        int matrix[] = {5, 3, 5, 4, 4, 2, 3, 4, 5, 3, 5, 4, 4, 3, 4, 3, 2, 3, 2, 4, 2};
        System.out.println("Amount of non-admission: " + amountOfNonAdmission(matrix));
    }

    public static int amountOfNonAdmission(int matrix[]) {
        int amount = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == 2) {
                amount++;
            }
        }
        return amount;
    }
}
