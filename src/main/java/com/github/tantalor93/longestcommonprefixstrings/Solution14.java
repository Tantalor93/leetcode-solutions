package com.github.tantalor93;

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
public class Solution14 {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        var shortestString = 0;
        for(var i = 0; i < strs.length; i++) {
            if(strs[shortestString].length() > strs[i].length()) {
                shortestString = i;
            }
        }
        for(var i = 0; i < strs[shortestString].length(); i++) {
            for(var j = 0; j < strs.length; j++) {
                if(strs[shortestString].charAt(i) != strs[j].charAt(i)) {
                    return strs[shortestString].substring(0,i);
                }
            }
        }
        return strs[shortestString];
    }
}
