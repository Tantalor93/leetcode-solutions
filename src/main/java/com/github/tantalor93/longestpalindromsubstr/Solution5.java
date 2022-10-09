package com.github.tantalor93.longestpalindromsubstr;

public class Solution5 {

    // expanding centers technique, palindromy jsou bud liche velikosti (centrum palindromu je jeden znak) nebo sude (centrem palindromu jsou dva znaky)
    // zkusim pokazde vzit jeden nebo dva znaky a budu je snazit se rozsirovat
    // touto technikou dosahneme slozitosti O(n^2) a pametove O(1)
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

            left = i-1;
            right = i;
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
