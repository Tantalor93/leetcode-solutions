package com.github.tantalor93.increasingtriplet;

// https://leetcode.com/problems/increasing-triplet-subsequence/
public class Solution334 {
	// budu si drzet dva ukazatele a ty budu kontrolovat jestli soucasne cislo v iteraci nahodou neni mensi nez dane cislo, pokud ano, tak
	// tim cislem prerazim ten ukazatel
	public boolean increasingTriplet(int[] nums) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for(var i = 0; i < nums.length; i++) {
			if(nums[i] <= first) {
				first = nums[i];
			} else if(nums[i] <= second) {
				second = nums[i];
			} else {
				return true;
			}
		}
		return false;
	}
}
