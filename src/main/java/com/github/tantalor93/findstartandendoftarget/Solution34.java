package com.github.tantalor93.findstartandendoftarget;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        var low = 0;
        var high = nums.length-1;
        var left = -1;
        var right = -1;
        while(low <= high) {
            var mid = (low+high)/2;

            if(nums[mid] == target) {
                if(mid+1 >= nums.length) {
                    right = mid;
                    break;
                } else if(mid+1 < nums.length && nums[mid+1] == target) {
                    low = mid+1;
                } else {
                    right = mid;
                    break;
                }
            } else if(nums[mid] < target) {
                low = mid+1;
            } else if(nums[mid] > target) {
                high = mid-1;
            }
        }
        low = 0;
        high = nums.length-1;
        while(low <= high) {
            var mid = (low+high)/2;
            if(nums[mid] == target) {
                if (mid-1 < 0) {
                    left = mid;
                    break;
                } else if(mid-1 >= 0 && nums[mid-1] == target) {
                    high = mid-1;
                } else {
                    left = mid;
                    break;
                }
            } else if(nums[mid] < target) {
                low = mid+1;
            } else if(nums[mid] > target) {
                high = mid-1;
            }
        }
        return new int[]{left, right};
    }

}
