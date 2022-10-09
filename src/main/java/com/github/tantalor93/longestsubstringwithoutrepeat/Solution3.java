package com.github.tantalor93.longestsubstringwithoutrepeat;

import java.util.HashSet;
import java.util.Set;

/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Solution3 {

    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        var max = 1;
        var set = new HashSet<Character>();
        var start = 0;
        for(var i = 0; i < s.length(); i++) {
            if(!set.add(s.charAt(i))) {
                while(s.charAt(start) != s.charAt(i)) {
                    set.remove(s.charAt(start));
                    start++;
                }
                start++;
            } else {
                max = Math.max(i-start+1, max);
            }
        }
        return max;
    }
}
