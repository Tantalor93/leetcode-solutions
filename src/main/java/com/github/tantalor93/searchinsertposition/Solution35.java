package com.github.tantalor93.searchinsertposition;

// https://leetcode.com/problems/search-insert-position/
public class Solution35 {
    // binary search
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
