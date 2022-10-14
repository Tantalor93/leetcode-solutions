package com.github.tantalor93.findkclosest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/find-k-closest-elements/
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
