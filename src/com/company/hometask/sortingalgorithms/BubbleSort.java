package com.company.hometask.sortingalgorithms;

import java.util.Arrays;

public class BubbleSort implements Sort {

    @Override
    public void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int l = j+1;
                if (array[l] < array[j]) {
                    array[l] = array[j] ^ array[l];
                    array[j] = array[j] ^ array[l];
                    array[l] = array[j] ^ array[l];
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
