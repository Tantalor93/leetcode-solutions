package com.github.tantalor93;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution49 {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> res = new HashMap<>();
		for(var i = 0; i < strs.length; i++) {
			var tmp = strs[i].toCharArray();
			Arrays.sort(tmp);
			if(res.get(new String(tmp)) != null) {
				res.get(new String(tmp)).add(strs[i]);
			} else {
				var l = new ArrayList<String>();
				l.add(strs[i]);
				res.put(new String(tmp), l);
			}
		}
		return new ArrayList<>(res.values());
	}
}
