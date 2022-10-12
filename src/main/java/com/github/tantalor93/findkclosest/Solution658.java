package com.github.tantalor93.findkclosest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given a sorted array, two integers k and x, find the k closest elements to x in the array. The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.
 * <p>
 * Example 1:
 * Input: [1,2,3,4,5], k=4, x=3
 * Output: [1,2,3,4]
 * Example 2:
 * Input: [1,2,3,4,5], k=4, x=-1
 * Output: [1,2,3,4]
 * Note:
 * The value k is positive and will always be smaller than the length of the sorted array.
 * Length of the given array is positive and will not exceed 104
 * Absolute value of elements in the array and x will not exceed 104
 */
public class Solution658 {

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        final List<Integer> list = new ArrayList();
        
        int index = Arrays.binarySearch(arr, x);

        if(index < 0) {
            index = -(index + 2);
        }
        int leftIndex = index;
        int rightIndex = index + 1;

        while (k > 0) {
            if (leftIndex < 0 && rightIndex < arr.length) {
                list.add(arr[rightIndex]);
                rightIndex++;
            } else if (rightIndex >= arr.length && leftIndex >= 0) {
                list.add(arr[leftIndex]);
                leftIndex--;
            } else if (Math.abs(x - arr[leftIndex]) > Math.abs(x - arr[rightIndex])) {
                list.add(arr[rightIndex]);
                rightIndex++;
            } else {
                list.add(arr[leftIndex]);
                leftIndex--;
            }
            k--;
        }
        Collections.sort(list);
        return list;
    }

}
