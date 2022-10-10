package com.github.tantalor93.jumpgame;

public class Solution45 {
	// pomoci dynamickeho programovani a memoizace si napocitam pole kde tmp[i] je nejmensi pocet skoku do indexu i
	public int jump(int[] nums) {
		int[] tmp = new int[nums.length];
		for(var i = 1; i < nums.length; i++) {
			tmp[i] = -1;
		}

		for(var i = 0; i < nums.length; i++) {
			for(var j = 1; j <= nums[i]; j++) {
				if(i+j < nums.length) {
					if(tmp[i+j] == -1) {
						tmp[i+j] = tmp[i]+1;
					} else {
						tmp[i+j] = Math.min(tmp[i]+1, tmp[i+j]);
					}
				}
			}
		}
		return tmp[nums.length-1];
	}
}
