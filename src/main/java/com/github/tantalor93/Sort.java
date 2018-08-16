package com.github.tantalor93;

public class Sort {

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (j + 1 < array.length && array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public static int[] insertSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int max = 0;
            for(int j = 0; j < array.length-i;j++) {
                if(array[max] < array[j]) {
                    max = j;
                }
            }
            int tmp = array[array.length -1 -i];
            array[array.length-1-i] = array[max];
            array[max] = tmp;
        }
        return array;
    }
}
