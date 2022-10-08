package com.github.tantalor93;

public class Solution142 {
	public ListNode detectCycle(ListNode head) {
		if(head == null) {
			return null;
		}
		var slow = head;
		var fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				break;
			}
		}
		if(fast == null || fast.next == null) {
			return null;
		}
		slow = head;
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
