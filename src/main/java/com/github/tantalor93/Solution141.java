package com.github.tantalor93;

public class Solution141 {
	public boolean hasCycle(ListNode head) {
		var slow = head;
		var fast = head;
		while(fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
}
