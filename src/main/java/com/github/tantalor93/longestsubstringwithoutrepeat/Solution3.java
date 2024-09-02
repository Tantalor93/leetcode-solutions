package com.github.tantalor93.longestsubstringwithoutrepeat;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class Solution3 {

	public int lengthOfLongestSubstring(String s) {
		var left = 0;
		var right = 0;
		var longest = 0;
		var set = new HashSet<Character>();
		while (right < s.length()) {
			if (!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				right++;
				longest = Math.max(longest, right - left);
			} else {
				set.remove(s.charAt(left));
				left++;
			}
		}
        return longest;
	}
}
