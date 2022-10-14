package com.github.tantalor93.longestmountain;

// https://leetcode.com/problems/longest-mountain-in-array/
public class Solution845 {

    public int longestMountain(int[] A) {
        if (A == null) return 0;
        int maxLength = 0;
        for (int left = 0; left < A.length; left++) {
            int peak = left + 1;
            if (peak >= A.length) continue;
            for (; peak < A.length; peak++) {
                if (A[peak] <= A[peak - 1]) {
                    peak--;
                    break;
                }
            }
            if (left == peak) continue;
            int right = peak + 1;
            if (right >= A.length) continue;
            for (; right < A.length; right++) {
                if (A[right] >= A[right - 1]) {
                    right--;
                    break;
                }
            }
            if (right == peak) continue;
            if (right == A.length) right--;
            int length = right - left + 1;
            maxLength = maxLength < length ? length : maxLength;
        }
        return maxLength;
    }

}
