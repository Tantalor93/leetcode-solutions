package com.github.tantalor93.swapeverywonodesinlist;

import com.github.tantalor93.ListNode;

// https://leetcode.com/problems/swap-nodes-in-pairs/
public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode it = head;
        while(it != null) {
            if(it.next == null) break;
            ListNode nextnext = it.next.next;
            ListNode next = it.next;
            it.next = nextnext;
            next.next = it;
            if(prev != null) prev.next = next;
            if(prev == null) head = next;

            prev = it;
            it = it.next;

        }
        return head;
    }
}
