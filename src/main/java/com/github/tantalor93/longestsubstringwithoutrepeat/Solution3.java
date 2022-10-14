package com.github.tantalor93.longestsubstringwithoutrepeat;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
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
