package com.github.tantalor93;

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
        int res = 0;
        for(int i = 0; i < s.length(); i++ ){
            Set<Character> set = new HashSet<>();
            int currRes = 0;
            for(int j = i; j >= 0; j--) {
                if(!set.contains(s.charAt(j))) {
                    currRes++;
                    set.add(s.charAt(j));
                } else {
                    break;
                }
            }
            if(currRes > res) {
                res= currRes;
            }

        }
        return res;
    }
}
