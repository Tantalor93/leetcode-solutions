package com.github.tantalor93.subsets;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/subsets/
public class Solution78 {

    // pomoci bitovy operaci
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

    //pomoci backtrackingu
    public List<List<Integer>> subsets2(int[] nums) {
       List<List<Integer>> list =  new ArrayList<>();;
       backtracking(nums, 0, new ArrayList<>(), list);
       return list;
    }

    private void backtracking(int[] nums, int start, List<Integer> list, List<List<Integer>> acc) {
        acc.add(list);
        for(var i = start; i < nums.length; i++) {
           list.add(nums[i]);
           backtracking(nums, i+1, list, acc);
           list.remove(list.size()-1);
        }
    }
}
