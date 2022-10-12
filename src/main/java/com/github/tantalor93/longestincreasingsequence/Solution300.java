package com.github.tantalor93.longestincreasingsequence;

public class Solution300 {
	// usage of dynamic programming tmp[i] represents the LIS from nums[0..i], we will count the numbers
	// from 0 index and for each i index we will go through previous indexes and remember the max
	public int lengthOfLIS(int[] nums) {
		var tmp = new int[nums.length];
		tmp[0] = 1;

		var max = 1;
		for(var i = 1; i < nums.length; i++) {
			tmp[i] = 1;
			for(var j = i-1; j >=0; j--) {
				if(nums[j] >= nums[i]) {
					continue;
				}
				tmp[i] = Math.max(tmp[j]+1, tmp[i]);
			}
			max = Math.max(max, tmp[i]);
		}

		return max;
	}
}
