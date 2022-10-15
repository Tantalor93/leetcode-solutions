package com.github.tantalor93.rotatedarraysearch;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class Solution33 {

	// upraveny binary search, rotovane pole ma vlastnost ze vzdy se da rozdelit na dve casti, kde jedna je serazena a druha ne,
	// pokud target je v intervalu serazene casti, tak hledam v serazene casti, jinak koukam do neserazene
	public int search(int[] nums, int target) {
		var left = 0;
		var right = nums.length-1;
		while(left <= right) {
			var mid = (left+right)/2;
			if(nums[mid] == target) {
				return mid;
			}
			if(nums[left] <= nums[mid]) {
				if(nums[left] <= target && nums[mid] > target) {
					right = mid-1;
				} else {
					left = mid +1;
				}
			} else {
				if(nums[mid] < target && nums[right] >= target) {
					left = mid+1;
				} else {
					right = mid-1;
				}
			}
		}
		return -1;
	}
}
