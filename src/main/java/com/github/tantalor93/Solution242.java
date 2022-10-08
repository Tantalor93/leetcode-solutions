package com.github.tantalor93;

import java.util.HashMap;
import java.util.Map;

public class Solution242 {
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		for(Character c : s.toCharArray()) {
			map.putIfAbsent(c, 0);
			map.put(c,map.get(c)+1);
		}
		for(Character c : t.toCharArray()) {
			map2.putIfAbsent(c, 0);
			map2.put(c,map2.get(c)+1);
		}
		if(map.keySet().size() != map2.keySet().size()) {
			return false;
		}
		for(Character c : map.keySet()) {
			if(!map.get(c).equals(map2.get(c))) {
				return false;
			}
		}
		return true;
	}
}
