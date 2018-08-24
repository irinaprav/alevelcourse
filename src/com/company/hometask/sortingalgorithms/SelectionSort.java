package com.company.hometask.sortingalgorithms;

import java.util.Arrays;

public class SelectionSort implements Sort {

    @Override
    public void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = min;
        }
        System.out.println(Arrays.toString(array));

    }
}
