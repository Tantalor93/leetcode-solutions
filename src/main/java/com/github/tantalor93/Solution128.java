package com.github.tantalor93;

import java.util.HashSet;
import java.util.Set;

public class Solution128 {
	public int longestConsecutive(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i : nums) {
			set.add(i);
		}

		var it = set.iterator();
		var max = 0;
		while(it.hasNext()) {
			var val = it.next();
			var cur = 0;
			if(set.contains(val+1)) {
				continue;
			}
			while(set.contains(val)) {
				cur++;
				val--;
			}
			max = Math.max(cur, max);
		}
		return max;
	}
}
