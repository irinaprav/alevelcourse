package com.company.hometask.sortingalgorithms;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class SortingsDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] currentArray = null;
        int capacity = 0;
        int algorithmChoice = 0;
        Sort algorithm = null;
        while (currentArray == null) {
            System.out.println("Enter array capacity:");
            try {
                capacity = in.nextInt();
                currentArray = new int[capacity];
                break;
            } catch (InputMismatchException e) {
                System.err.println("Try again...");
                in.next();
            }
        }
        System.out.println("Fill with random or your input?\ninput random or input");
        switch (in.next()) {
            case "random":
                fillWithRandom(currentArray);
                break;
            case "input":fillWithInput(currentArray,in);
                break;
            default:
                fillWithRandom(currentArray);
        }
        while (algorithmChoice != 6) {
            System.out.println("---ALGORITHMS---");
            System.out.println("1.\tBUBBLE SORT");
            System.out.println("2.\tSELECTION SORT");
            System.out.println("3.\tINSERTION SORT");
            System.out.println("4.\tQUICK SORT");
            System.out.println("5.\tMERGE SORT");
            System.out.println("6.\tEXIT");
            do {
                try {
                    algorithmChoice = in.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Try again...");
                    in.next();
                    continue;
                }
            } while (algorithmChoice == 0);
            while (algorithm == null) {
                switch (algorithmChoice) {
                    case 1:
                        algorithm = new BubbleSort();
                        break;
                    case 2:
                        algorithm = new SelectionSort();
                        break;
                    case 3:
                        algorithm = new InsertionSort();
                        break;
                    case 4:
                        algorithm = new QuickSort();
                        break;
                    case 5:
                        algorithm = new MergeSort();
                        break;
                }
            }
            algorithm.sort(currentArray);
        }
    }

    private static void fillWithRandom(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(156);
        }
    }
    private static void fillWithInput(int[] array, Scanner in) {
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
    }
}
