package com.github.tantalor93;

import java.util.Arrays;
import java.util.Comparator;

/*
Alice has a hand of cards, given as an array of integers.

Now she wants to rearrange the cards into groups so that each group is size W, and consists of W consecutive cards.

Return true if and only if she can.



Example 1:

Input: hand = [1,2,3,6,2,3,4,7,8], W = 3
Output: true
Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8].
Example 2:

Input: hand = [1,2,3,4,5], W = 4
Output: false
Explanation: Alice's hand can't be rearranged into groups of 4.


Note:

1 <= hand.length <= 10000
0 <= hand[i] <= 10^9
1 <= W <= hand.length
*/
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
