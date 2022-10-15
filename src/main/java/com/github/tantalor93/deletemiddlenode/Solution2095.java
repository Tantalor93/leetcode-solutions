package com.github.tantalor93.deletemiddlenode;

import com.github.tantalor93.ListNode;

// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
public class Solution2095 {

	// technika dvou pointeru
	public ListNode deleteMiddle(ListNode head) {
		if(head.next == null) {
			return null;
		}
		var slow = head;
		var fast = head;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			if(fast == null || fast.next == null) {
				slow.next = slow.next.next;
			}

			slow = slow.next;
		}
		return head;
	}
}
