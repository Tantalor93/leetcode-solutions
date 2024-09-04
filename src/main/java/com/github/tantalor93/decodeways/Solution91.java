package com.github.tantalor93.decodeways;

public class Solution91 {

	public int numDecodings(String s) {
		var result = new int[s.length()+1];

		result[0] = 1;

		if (s.charAt(0) != '0') {
			result[1] = 1;
		}

		for(var k = 2; k <= s.length(); k++) {
			int first = Integer.valueOf(s.substring(k - 1, k));
			int second = Integer.valueOf(s.substring(k - 2, k));
			if (first >= 1 && first <= 9) {
				result[k] += result[k-1];
			}
			if (second >= 10 && second <= 26) {
				result[k] += result[k-2];
			}
		}

		return result[s.length()];
	}
}
