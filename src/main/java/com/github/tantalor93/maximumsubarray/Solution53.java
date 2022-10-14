package com.github.tantalor93.maximumsubarray;

// https://leetcode.com/problems/maximum-subarray/
public class Solution53 {
	// dynamicke programovani, kde nums[i] = max(nums[i], nums[i-1]+nums[i]) tzn. ite cislo pridam k predchozi sume nebo ite cislo zacina novou sumu
	public int maxSubArray(int[] nums) {
		for(var i = 1; i< nums.length; i++) {
			nums[i] = Math.max(nums[i], nums[i-1]+nums[i]);
		}
		var max = nums[0];
		for(var i = 0; i < nums.length; i++) {
			max = Math.max(nums[i], max);
		}
		return max;
	}
}
