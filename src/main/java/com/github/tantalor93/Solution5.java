package com.github.tantalor93;

public class Solution5 {

    // expanding centers technique
    public String longestPalindrome(String s) {
        if(s.length() == 1) {
            return s;
        }
        var max = 1;
        var maxLeft = 0;
        var maxRight = 0;
        for(var i = 1; i < s.length(); i++) {
            var left = i-1;
            var right = i+1;
            while(left >= 0 && right < s.length()) {
                if(s.charAt(left) == s.charAt(right)) {
                    if(max < right-left+1) {
                        maxLeft = left;
                        maxRight = right;
                        max = right-left+1;
                    }
                    left--;
                    right++;
                } else {
                    break;
                }
            }
        }
        for(var i = 1; i < s.length(); i++) {
            var left = i-1;
            var right = i;
            while(left >= 0 && right < s.length()) {
                if(s.charAt(left) == s.charAt(right)) {
                    if(max < right-left+1) {
                        maxLeft = left;
                        maxRight = right;
                        max = right-left+1;
                    }
                    left--;
                    right++;
                } else {
                    break;
                }
            }

        }
        return s.substring(maxLeft, maxRight+1);

    }

}
