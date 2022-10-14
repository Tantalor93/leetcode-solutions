package com.github.tantalor93.removeduplicatesfromsortedlist;

import com.github.tantalor93.ListNode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
