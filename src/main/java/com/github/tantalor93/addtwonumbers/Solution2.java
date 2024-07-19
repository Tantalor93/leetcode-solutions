package com.github.tantalor93.addtwonumbers;

import com.github.tantalor93.ListNode;

// https://leetcode.com/problems/add-two-numbers/
public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersWithCarry(l1, l2, 0);
    }

    private ListNode addTwoNumbersWithCarry(ListNode l1, ListNode l2, int carry) {
        if(l1 == null && l2 == null) {
            if(carry != 0) {
                return new ListNode(carry);
            }
            return null;
        }
        if(l1 == null) {
            if(carry != 0) {
                var newCarry = (l2.val + carry)/10;
                var val = (l2.val + carry)%10;
                var node = new ListNode(val);
                node.next = addTwoNumbersWithCarry(l1, l2.next, newCarry);
                return node;
            }
            return l2;
        }
        if(l2 == null) {
            if(carry != 0) {
                var newCarry = (l1.val + carry)/10;
                var val = (l1.val + carry)%10;
                var node = new ListNode(val);
                node.next = addTwoNumbersWithCarry(l1.next, l2, newCarry);
                return node;
            }
            return l1;
        }
        var newCarry = (l1.val + l2.val + carry)/10;
        var val = (l1.val + l2.val + carry)%10;
        var node = new ListNode(val);
        node.next = addTwoNumbersWithCarry(l1.next, l2.next, newCarry);
        return node;
    }
}
