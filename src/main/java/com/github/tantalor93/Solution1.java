package com.github.tantalor93;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/
public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for(var i = 0; i < nums.length; i++) {
            var complement = map.get(target - nums[i]);
            if (complement != null) {
                return new int[] { i, complement };
            }
            map.put(nums[i], i);

        }
        return null;
    }

}
