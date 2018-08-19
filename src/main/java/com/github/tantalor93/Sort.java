package com.github.tantalor93;

public class Sort {

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (j + 1 < array.length && array[j] > array[j + 1]) {
                    flip(array, j, j+1);
                }
            }
        }
        return array;
    }

    public static int[] insertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = 0;
            for (int j = 0; j < array.length - i; j++) {
                if (array[max] < array[j]) {
                    max = j;
                }
            }
            flip(array, array.length - 1 - i, max);
        }
        return array;
    }

    public static int[] quickSort(int[] array) {
        doQuickSort(array, 0, array.length-1);
        return array;
    }

    private static void doQuickSort(int[] array, int start, int end) {
        if (!(start < end)) return;
        int pivot = array[start];
        int pivotIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if(array[i] < pivot) {
                flip(array, pivotIndex, pivotIndex+1);
                if (pivotIndex + 1 != i)  {
                    flip(array, pivotIndex, i);
                }
                pivotIndex++;
            }
        }
        doQuickSort(array, start, pivotIndex - 1);
        doQuickSort(array, pivotIndex + 1, end);

    }

    private static void flip(int[] array, int i, int j) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }
}
