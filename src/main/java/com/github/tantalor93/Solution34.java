package com.github.tantalor93;

/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        return searchRecursively(nums, 0, nums.length - 1, target);
    }

    private int[] searchRecursively(int[] nums, int left, int right, int target) {

        int begin = -1;
        int end = -1;

        if (right >= left) {

            int midIndex = (left + right) / 2;

            int mid = nums[midIndex];


            if (mid == target) {
                int i = midIndex - 1;
                for (; i >= 0; i--) {
                    if (nums[i] != target) {
                        break;
                    }
                }
                begin = ++i;

                int j = midIndex + 1;
                for (; j < nums.length; j++) {
                    if (nums[j] != target) {
                        break;
                    }
                }
                end = --j;
            }


            if (mid > target) {
                return searchRecursively(nums, left, midIndex - 1, target);
            }

            if (mid < target)
                return searchRecursively(nums, midIndex + 1, right, target);
        }

        return new int[]{begin, end};

    }
}
