package com.github.tantalor93.longestconsecutiveseq;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution128 {
// pouziju Set do ktereho si nahazim vsechny prvky a pak projdu set a budu v tom setu hledat prvky i-1, i-2,...
	public int longestConsecutive(int[] nums) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
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
