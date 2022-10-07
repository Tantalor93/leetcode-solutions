package com.github.tantalor93;
/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0
 */
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        var low = 0;
        var high = nums.length-1;
        while(low <= high) {
            var mid = (low + high)/2;

            if(nums[mid] == target) {
                high = mid-1;
            } else if(nums[mid] < target) {
                if(mid+1 >= nums.length) {
                    return nums.length;
                } else if(nums[mid+1] > target) {
                    return mid+1;
                } else {
                    low = mid+1;
                }
            } else if(nums[mid] > target) {
                if(mid-1 < 0) {
                    return 0;
                } else if(nums[mid-1] < target) {
                    return mid;
                } else {
                    high = mid-1;
                }
            }
        }
        return low;
    }
}
