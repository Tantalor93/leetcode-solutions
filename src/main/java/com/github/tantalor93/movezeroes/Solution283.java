package com.github.tantalor93.movezeroes;

// https://leetcode.com/problems/move-zeroes/description/
public class Solution283 {

	public void moveZeroes(int[] nums) {
		var j = 0;
		for(var i = 0; i < nums.length; i++) {
			if(nums[i] == 0) {
				continue;
			}
			var tmp = nums[j];
			nums[j] = nums[i];
			nums[i] = tmp;
			j++;
		}
	}
}
