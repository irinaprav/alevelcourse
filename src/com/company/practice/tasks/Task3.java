package com.company.practice.tasks;

public class Task3 {
    public static void main(String[] args) {
        int matrix[] = {0, 5, 0, 9, -6, -85, -7, 0, 56, -9, -5, 45, 0, 18, 14, 16};
        String posorneg = (matrix[0] == 0) ? "Zero" : (matrix[0] > 0) ? "Positive" : "Negative";
        System.out.println("First element is " + posorneg);
    }
}
