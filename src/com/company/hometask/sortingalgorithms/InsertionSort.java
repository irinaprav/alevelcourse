package com.company.hometask.sortingalgorithms;

import java.util.Arrays;

public class InsertionSort implements Sort{

    @Override
    public void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while(j>0){
                if(array[j]<array[j-1]){
                    array[j] = array[j] ^ array[j-1];
                    array[j-1] = array[j] ^ array[j-1];
                    array[j] = array[j] ^ array[j-1];
                }
                j--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
