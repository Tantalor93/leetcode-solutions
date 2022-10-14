package com.github.tantalor93.singlenumber;

// https://leetcode.com/problems/single-number/
public class Solution136 {
	public int singleNumber(int[] nums) {
		var val = 0;
		for(var i = 0; i < nums.length; i++) {
			// xor value, two sames values will negate them selves
			val ^= nums[i];
		}
		return val;
	}
}
