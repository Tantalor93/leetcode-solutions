package com.github.tantalor93.containerwithmostwater;

// https://leetcode.com/problems/container-with-most-water/description/
public class Solution11 {
	// pomoci dvou pointeru zleva a zprava, vzdy posunu ten pointer ktery je mensi
	public int maxArea(int[] height) {
		var left = 0;
		var right = height.length-1;

		var max = 0;
		while(left < right) {
			max = Math.max(volume(height, left, right), max);
			if(height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return max;
	}

	private int volume(int[] height,int left, int right) {
		var y = Math.min(height[left], height[right]);
		var x = right-left;
		return x*y;
	}
}
