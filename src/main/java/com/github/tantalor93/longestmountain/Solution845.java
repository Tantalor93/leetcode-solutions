package com.github.tantalor93.longestmountain;

//Let's call any (contiguous) subarray B (of A) a mountain if the following properties hold:
//
//        B.length >= 3
//        There exists some 0 < i < B.length - 1 such that B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
//        (Note that B could be any subarray of A, including the entire array A.)
//
//        Given an array A of integers, return the length of the longest mountain.
//
//        Return 0 if there is no mountain.
//
//        Example 1:
//
//        Input: [2,1,4,7,3,2,5]
//        Output: 5
//        Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
//        Example 2:
//
//        Input: [2,2,2]
//        Output: 0
//        Explanation: There is no mountain.
//        Note:
//
//        0 <= A.length <= 10000
//        0 <= A[i] <= 10000
//        Follow up:
//
//        Can you solve it using only one pass?
//        Can you solve it in O(1) space?

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
