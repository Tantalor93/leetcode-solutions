package com.github.tantalor93.removeduplicatesfromsortedlist;

import java.util.HashSet;
import java.util.Set;

import com.github.tantalor93.ListNode;

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

    // metoda dvou pointeru, fast pointer preskoci duplikaty a slow pak rovnou bude ukazovat na ten dalsi neduplikatni
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        var slow = head;
        var fast = head.next;
        while(fast != null) {
            while(fast != null && slow.val == fast.val) {
                fast = fast.next;
            }
            slow.next = fast;
            slow = slow.next;
            if(fast != null) {
                fast = fast.next;
            }
        }
        return head;
    }
}
