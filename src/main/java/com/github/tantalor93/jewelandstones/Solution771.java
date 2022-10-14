package com.github.tantalor93.jewelandstones;

// https://leetcode.com/problems/jewels-and-stones/
public class Solution771 {

    public int numJewelsInStones(String J, String S) {
        int num = 0;
        for(int i = 0; i < J.length(); i++) {
            for(int j = 0; j < S.length(); j++) {
                if(S.charAt(j) == J.charAt(i)) num++;
            }
        }
        return num;
    }
}
