package com.github.tantalor93;

import java.util.HashSet;
import java.util.Set;

/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
* */
public class Solution83 {

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return head;
        if(head.next == null) return head;

        Set<Integer> dups = new HashSet<>();

        ListNode cursor = head.next;
        ListNode prev = head;
        dups.add(prev.val);
        while(cursor != null) {
            if(dups.contains(cursor.val)) {
                prev.next = cursor.next;
            }
            else{
                dups.add(cursor.val);
                prev = cursor;
            }
            cursor = cursor.next;
        }

        return head;
    }
}
