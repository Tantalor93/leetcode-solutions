package com.github.tantalor93.numberof1bits;

// https://leetcode.com/problems/number-of-1-bits/
public class Solution191 {
    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }
}
