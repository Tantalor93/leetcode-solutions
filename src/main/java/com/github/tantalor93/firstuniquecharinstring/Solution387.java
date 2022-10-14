package com.github.tantalor93.firstuniquecharinstring;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/first-unique-character-in-a-string/description/
public class Solution387 {
	public int firstUniqChar(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for(var i = 0; i < s.length(); i++) {
			var curr = map.getOrDefault(s.charAt(i),0);
			map.put(s.charAt(i), curr+1);
		}
		for(var i = 0; i< s.length(); i++) {
			if(map.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
}
