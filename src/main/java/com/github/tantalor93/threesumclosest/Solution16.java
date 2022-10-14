package com.github.tantalor93.threesumclosest;

import java.util.Arrays;

// https://leetcode.com/problems/3sum-closest/
public class Solution16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int lastDiff = Integer.MAX_VALUE;
        int res = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int sum =  nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);
                if(diff < lastDiff) {
                    lastDiff = diff;
                    res = sum;
                }
                if(sum == target) return res;
                if(sum < target) left++;
                else right--;

            }
        }
        return res;
    }
}
