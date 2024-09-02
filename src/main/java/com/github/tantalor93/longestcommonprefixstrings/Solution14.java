package com.github.tantalor93.longestcommonprefixstrings;

// https://leetcode.com/problems/longest-common-prefix/
public class Solution14 {

	public String longestCommonPrefix(String[] strs) {
		var minIndex = 0;
		for (var i = 0; i < strs.length; i++) {
			if (strs[minIndex].length() > strs[i].length()) {
				minIndex = i;
			}
		}
		var end = 0;
		for (; end < strs[minIndex].length(); end++) {
			for (var str : strs) {
				if (str.charAt(end) != strs[minIndex].charAt(end)) {
					return str.substring(0, end);
				}
			}
		}
		return strs[minIndex].substring(0, end);
	}
}
