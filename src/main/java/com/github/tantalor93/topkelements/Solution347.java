package com.github.tantalor93.topkelements;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// https://leetcode.com/problems/top-k-frequent-elements/
public class Solution347 {

	// prvni si napocitam mapu kde klic je prvek v poli a hodnota je jeho frequence v poli
	// nasledne si vybuduju min Heap s max velikosti k
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for(var i = 0; i < nums.length; i++) {
			if(map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i])+1);
			}
		}

		PriorityQueue<Integer> que = new PriorityQueue<>(k,
				Comparator.comparingInt((key) -> map.get(key))
		);

		for(int i: map.keySet()){
			que.add(i);
			if(que.size()>k)
				que.remove();
		}

		return que.stream().mapToInt(Integer::valueOf).toArray();
	}

}
