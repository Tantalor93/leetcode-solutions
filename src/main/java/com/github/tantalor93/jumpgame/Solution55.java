package com.github.tantalor93.jumpgame;

// https://leetcode.com/problems/jump-game/description/
public class Solution55 {

	// budu si pamatovat jak nejdal dokazu doskocit a u toho kontrolovat ze dany prvek je vzdy dosazitelny
	public boolean canJump(int[] nums) {
		var maxjump = 0;
		for(var i = 0; i < nums.length; i++) {
			if(i > maxjump) {
				return false;
			}
			maxjump = Math.max(maxjump, i+nums[i]);
		}
		if(maxjump >= nums.length-1) {
			return true;
		}
		return false;
	}
}
