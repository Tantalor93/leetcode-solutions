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

    private static void doQuickSort(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }

        flip(arr, start, end);

        var j = start;
        for(var i = start; i < end; i++) {
            if(arr[i] < arr[end]) {
                flip(arr, i, j);
                j++;
            }
        }
        flip(arr, j, end);
        doQuickSort(arr, start, j-1);
        doQuickSort(arr, j+1, end);
    }

    private static void flip(int[] array, int i, int j) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

    public static int[] mergeSort(int[] array) {
        if(array.length < 2) {
            return array;
        }
        var mid = array.length/2;
        var left = new int[mid];
        var right = new int[array.length-mid];
        for(var i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for(var i = mid; i < array.length; i++) {
            right[i-mid] = array[i];
        }
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] arr1, int[] arr2)  {
        var res = new int[arr1.length + arr2.length];

        var l = 0;
        var r = 0;
        for(var i = 0; i < res.length; i++){
            if(l >= arr1.length) {
                res[i] = arr2[r++];
            } else if(r >= arr2.length) {
                res[i] = arr1[l++];
            } else if(arr1[l] < arr2[r]) {
                res[i] = arr1[l++];
            } else {
                res[i] = arr2[r++];
            }
        }
        return res;
    }
}
