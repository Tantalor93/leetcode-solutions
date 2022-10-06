package com.github.tantalor93;

public class Solution19 {

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode it = head;
		ListNode prev = head;
		var dist = 0;
		while (it != null) {
			it = it.next;
			dist++;
			if (dist > n + 1) {
				prev = prev.next;
				dist--;
			}
		}
		if (prev == head && dist == n) {
			return head.next;
		} else if (prev.next != null) {
			prev.next = prev.next.next;
		}

		return head;
	}
}
