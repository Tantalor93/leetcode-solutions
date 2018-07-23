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
        int minSizeOfWord = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++) {
            minSizeOfWord = (strs[i].length() < minSizeOfWord)? strs[i].length() : minSizeOfWord;
        }

        boolean stop = false;
        StringBuilder strb = new StringBuilder();
        if(strs.length != 0) {
            for(int i = 0; i < minSizeOfWord; i++) {
                char c = strs[0].charAt(i);
                for(int j = 0; j < strs.length; j++) {
                    if(strs[j].charAt(i) != c) {
                        stop = true;
                        break;
                    }
                }

                if(stop) break;
                if(!stop) strb.append(c);
            }
        }
        return strb.toString();
    }
}
