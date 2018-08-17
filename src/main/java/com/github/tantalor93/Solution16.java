package com.github.tantalor93;

import java.util.Arrays;

/**
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 * Example:
 *
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 *
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
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
