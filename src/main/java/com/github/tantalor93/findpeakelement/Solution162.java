package com.github.tantalor93.findpeakelement;

// https://leetcode.com/problems/find-peak-element/description/
public class Solution162 {
	public int findPeakElement(int[] nums) {
		return findPeakElementRec(nums, 0, nums.length-1);
	}

	private int findPeakElementRec(int[] nums, int l, int r) {
		if (l == r)
			return l;
		int mid = (l + r) / 2;
		if (nums[mid] > nums[mid + 1])
			return findPeakElementRec(nums, l, mid);
		return findPeakElementRec(nums, mid + 1, r);
	}
}
