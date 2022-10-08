package com.github.tantalor93;

import java.util.HashMap;
import java.util.Map;

public class Solution169 {
	public int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for(var i = 0; i < nums.length; i++) {
			if(map.get(nums[i]) == null) {
				map.put(nums[i],0);
			}
			map.put(nums[i], map.get(nums[i])+1);
		}

		for(var k : map.keySet()) {
			if(map.get(k) > nums.length/2) {
				return k;
			}
		}
		return 0;
	}
}
