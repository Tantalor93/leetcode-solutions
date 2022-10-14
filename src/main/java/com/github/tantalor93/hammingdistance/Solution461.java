package com.github.tantalor93.hammingdistance;

// https://leetcode.com/problems/hamming-distance/
public class Solution461 {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int num = 0;
        num += xor & 1;
        while(xor != 0) {
            xor = xor >> 1;
            num += xor & 1;
        }
        return num;
    }

}
