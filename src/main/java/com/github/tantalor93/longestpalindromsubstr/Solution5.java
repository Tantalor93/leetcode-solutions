package com.github.tantalor93.longestpalindromsubstr;

// https://leetcode.com/problems/longest-palindromic-substring/
public class Solution5 {

	// expanding centers technique, palindromy jsou bud liche velikosti (centrum palindromu je jeden znak) nebo sude (centrem palindromu jsou dva znaky)
	// zkusim pokazde vzit jeden nebo dva znaky a budu je snazit se rozsirovat
	// touto technikou dosahneme slozitosti O(n^2) a pametove O(1)
	public String longestPalindrome(String s) {
		return expandingCentersTechnique(s);
	}

	public String naive(String s) {
		var max = 0;
		var start = 0;
		var end = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				var cur = 0;
				for (int k = 0; k < j - i + 1; k++) {
					if (s.charAt(i + k) != s.charAt(j - k)) {
						cur = 0;
						break;
					}
					cur++;
				}
				if (cur > max) {
					max = cur;
					start = i;
					end = j;
				}
			}
		}
		return s.substring(start, end + 1);
	}

	// we avoid repeating checks whether substrings are palindroms by remembering sub-problem solutions, we first prepare
	// matrix where matrix[i][j] represents if substring starting from i and end at j is palindrome
    // we then start counting matrix continuously from lesser subproblems (substrings of length k) to major problem (substring of length s)
	public String memoization(String s) {
		var start = 0;
		var end = 0;
		var max = 1;

		var matrix = new boolean[s.length()][s.length()];
		for (var i = 0; i < s.length(); i++) {
			matrix[i][i] = true;
		}

		for (var i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				matrix[i][i + 1] = true;
				start = i;
				end = i + 1;
				max = 2;
			}
		}

		for (var k = 3; k <= s.length(); k++) {
			for (var i = 0; i < s.length() - k + 1; i++) {
				var j = i + k - 1;
				if (s.charAt(i) == s.charAt(j) && matrix[i + 1][j - 1]) {
					matrix[i][j] = true;
					if (k > max) {
						start = i;
						end = j;
					}
				}
			}
		}
		return s.substring(start, end + 1);
	}

	public String expandingCentersTechnique(String s) {
		if (s.length() == 1) {
			return s;
		}
		var max = 1;
		var maxLeft = 0;
		var maxRight = 0;
		for (var i = 1; i < s.length(); i++) {
			var left = i - 1;
			var right = i + 1;
			while (left >= 0 && right < s.length()) {
				if (s.charAt(left) == s.charAt(right)) {
					if (max < right - left + 1) {
						maxLeft = left;
						maxRight = right;
						max = right - left + 1;
					}
					left--;
					right++;
				} else {
					break;
				}
			}

			left = i - 1;
			right = i;
			while (left >= 0 && right < s.length()) {
				if (s.charAt(left) == s.charAt(right)) {
					if (max < right - left + 1) {
						maxLeft = left;
						maxRight = right;
						max = right - left + 1;
					}
					left--;
					right++;
				} else {
					break;
				}
			}
		}
		return s.substring(maxLeft, maxRight + 1);
	}

}
