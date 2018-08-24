package com.company.hometask.sortingalgorithms;

import java.util.Arrays;

public class MergeSort implements Sort{

    @Override
    public void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    private void mergeSort(int[] array, int low, int high) {
        if (high <= low)
            return;
        int middle = low + (high - low) / 2;
        mergeSort(array, low, middle);
        mergeSort(array, middle + 1, high);
        int i = low, j = middle + 1;
        int[] buffer = Arrays.copyOf(array, array.length);
        for (int z = low; z <= high; z++) {
            if (i > middle) {
                array[z] = buffer[j++];
            } else if (j > high) {
                array[z] = buffer[i++];
            } else if (buffer[j] < buffer[i]) {
                array[z] = buffer[j++];
            } else {
                array[z] = buffer[i++];
            }
        }
    }
}
