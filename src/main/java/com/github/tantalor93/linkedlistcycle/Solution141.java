package com.github.tantalor93.linkedlistcycle;

import com.github.tantalor93.ListNode;

public class Solution141 {
	public boolean hasCycle(ListNode head) {
		var slow = head;
		var fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
}
