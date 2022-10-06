package com.github.tantalor93;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class Solution2 {
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
