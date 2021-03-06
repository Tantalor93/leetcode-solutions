package com.github.tantalor93;

import java.util.ArrayList;
import java.util.List;

/*
Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
* */
public class Solution78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); // number of sets is 2 exp nums.length
        for(int i = 0; i < (1 << nums.length); i++) {  // number of set, for example 011
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < nums.length; j++) {
                if((i & (1 << j)) > 0) list.add(nums[j]); // 011 & 001, number is part of set
            }
            res.add(list);
        }

        return res;
    }
}
