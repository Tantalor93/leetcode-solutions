package com.github.tantalor93.findduplicate;

// https://leetcode.com/problems/find-the-duplicate-number/description/
public class Solution287 {

	// zalozeno na dvou pointerech (pomaly a rychly = tortoise and hare), jakmile se poprve potkaji tak jsme nasli intersection, potom zresetujeme
	// zelvu a rychly pointer pustime pomalu, tohle funguje diky tomu ze vime ze 1 <= nums[i] <= n
	public int findDuplicate(int[] nums) {
		var slow = 0;
		var fast = 0;
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while(slow != fast);

		slow = 0;
		while(slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;

	}
}
