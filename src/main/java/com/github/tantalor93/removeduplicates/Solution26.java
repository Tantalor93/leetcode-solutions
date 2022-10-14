package com.github.tantalor93.removeduplicates;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        var j = 0;
        for(var i = 0; i < nums.length; i++) {
            if(j-1 >= 0 && nums[i] == nums[j-1]) {
                continue;
            }
            nums[j] = nums[i];
            j++;
        }
        return j;
    }
}
