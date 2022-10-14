package com.github.tantalor93.productarrayexceptself;

// https://leetcode.com/problems/product-of-array-except-self/
public class Solution238 {
	public int[] productExceptSelf(int[] nums) {
		int[] forward = new int[nums.length];
		forward[0] = 1;
		for(var i = 1; i < nums.length; i++) {
			forward[i] = forward[i-1] * nums[i-1];
		}

		int[] backward = new int[nums.length];
		backward[nums.length-1] = 1;
		for(var i = nums.length-2; i >= 0; i--) {
			backward[i] = backward[i+1] * nums[i+1];
		}

		for(var i = 0; i < nums.length; i++) {
			forward[i] *= backward[i];
		}
		return forward;
	}
}
