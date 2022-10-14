package com.github.tantalor93.addtwonumbers;

import com.github.tantalor93.ListNode;

// https://leetcode.com/problems/add-two-numbers/
public class Solution2 {

    // budu iterovat seznamy a pokazde spocitam carry=(val1+val2+carry)%10 a soucasnou hodnotu value=(val1+val2+carry)/10,
    // slozitost je O(n) a pametova O(1)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {
            return l1 == null? l2 : l1;
        }
        ListNode start = null;
        var carry = 0;
        var it1 = l1;
        var it2 = l2;
        ListNode prev = null;
        while(it1 != null || it2 != null) {
            if(it1 != null && it2 != null) {
                var n = new ListNode((it1.val + it2.val+carry)%10);
                carry = (it1.val+it2.val+carry)/10;
                if(start == null) {
                    start = n;
                }
                if(prev != null) {
                    prev.next = n;
                }
                prev = n;
                it1 = it1.next;
                it2 = it2.next;
            }
            if(it1 != null && it2 == null) {
                var n = new ListNode((it1.val +carry)%10);
                carry = (it1.val+carry)/10;
                if(prev != null) {
                    prev.next = n;
                }
                prev = n;
                it1 = it1.next;
            }
            if(it2 != null && it1 == null) {
                var n = new ListNode((it2.val +carry)%10);
                carry = (it2.val+carry)/10;
                if(prev != null) {
                    prev.next = n;
                }
                prev = n;
                it2 = it2.next;
            }
        }
        if(carry != 0) {
            prev.next = new ListNode(carry);
        }
        return start;
    }
}
