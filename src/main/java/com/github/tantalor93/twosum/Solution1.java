package com.github.tantalor93.twosum;

import java.util.HashMap;

// https://leetcode.com/problems/two-sum/
public class Solution1 {

    // postupne budu iterovat a pouziju hash mapu do ktere si budu ukladat mapovani hodnota => index, pro kazdy prvek se podivam do mapy,
    // jestli jsem uz nevidel komplement = target-<soucasna_hodnota>, slozitost je O(n) a pametova je O(n)
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
