package com.github.tantalor93.removeelement;

// https://leetcode.com/problems/remove-element/
public class Solution27 {

	public static int removeElement(int[] nums, int val) {
		var j = 0;
		for(var i = 0; i < nums.length; i++) {
			if(nums[i] == val) {
				continue;
			}
			nums[j] = nums[i];
			j++;
		}
		return j;
	}
}
