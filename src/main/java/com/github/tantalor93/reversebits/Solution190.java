package com.github.tantalor93.reversebits;

// https://leetcode.com/problems/reverse-bits/
public class Solution190 {
    public int reverseBits(int n) {
        int tmp = n;
        int res = 0;
        for(int i = 0; i < 32; i++) {
            res <<= 1;
            res |= (tmp & 1);
            tmp >>= 1;
        }
        return res;
    }
}
