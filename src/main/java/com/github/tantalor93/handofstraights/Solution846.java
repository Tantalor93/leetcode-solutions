package com.github.tantalor93.handofstraights;

import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/hand-of-straights/
public class Solution846 {
    public boolean isNStraightHand(int[] hand, int W) {
        Arrays.sort(hand);
        boolean[] used = new boolean[hand.length];
        for(int i = 0; i < hand.length; i++) {
            if(used[i] == false) {
                used[i] = true;
                int last = hand[i];
                int count = 1;
                for(int j = 0; j < hand.length ; j++) {
                    if(count == W) break;
                    if(!used[j] && hand[j]  == last+ 1) {
                        used[j] = true;
                        count++;
                        last = hand[j];
                    }
                }
                if(count != W) return false;
            }
        }
        return true;
    }
}
