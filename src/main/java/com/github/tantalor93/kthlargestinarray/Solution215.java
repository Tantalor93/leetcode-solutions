package com.github.tantalor93.kthlargestinarray;

import java.util.PriorityQueue;

// https://leetcode.com/problems/kth-largest-element-in-an-array/description/
public class Solution215 {

	// pouzijeme min heap, budem udrzovat velikost K a nakonci vime ze top heapy je k-ty nejvetsi prvek
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> heap = new PriorityQueue<>(k);
		for(var i = 0; i< nums.length; i++) {
			heap.add(nums[i]);
			if(heap.size() > k) {
				heap.poll();
			}
		}
		return heap.poll();
	}
}
