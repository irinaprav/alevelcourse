package com.company.practice.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int matrix[] = {1, 5, 9, -6, -85, -7, 56, -9, -5, 45, 18, 14, 16};
        Scanner in =new Scanner(System.in);
        int i= in.nextInt();
        printLessThanI(matrix,i);
    }
    public static void printLessThanI(int matrix[],int chislo){
        for(int i = 0;i<matrix.length;i++){
            if(matrix[i]<=chislo){
                System.out.print(matrix[i]+" ");
            }
        }
    }
}
