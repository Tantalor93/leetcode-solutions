package com.github.tantalor93.firstoccurenceofstring;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
public class Solution28 {
    public int strStr(String haystack, String needle) {
        for(var i = 0; i< haystack.length(); i++) {
            if(i+needle.length() <= haystack.length() && haystack.substring(i, i+needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
