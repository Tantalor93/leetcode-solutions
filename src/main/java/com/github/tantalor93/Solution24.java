package com.github.tantalor93;

/*
Given a linked list, swap every two adjacent nodes and return its head.

Example:

Given 1->2->3->4, you should return the list as 2->1->4->3.
Note:

Your algorithm should use only constant extra space.
You may not modify the values in the list's nodes, only nodes itself may be changed.
 */
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
