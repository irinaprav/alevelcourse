package com.company.hometask.sortingalgorithms;

import java.util.Arrays;

public class QuickSort implements Sort {

    @Override
    public void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private void quickSort(int[] array, int low, int high) {
        int position = (low + high) / 2;
        int pivot = array[position];
        int left = low;
        int right = high;
        while (array[left] < pivot)
            left++;
        while (array[right] > pivot)
            right--;
        if (left <= right) {
            if (left != right) {
                array[left] = array[left] ^ array[right];
                array[right] = array[left] ^ array[right];
                array[left] = array[left] ^ array[right];
            }
            left++;
            right--;
        }
        if (left < high) quickSort(array, left, high);
        if (right > low) quickSort(array,low,right);
    }
}
