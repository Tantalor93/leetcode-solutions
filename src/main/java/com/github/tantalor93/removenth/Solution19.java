package com.github.tantalor93.removenth;

import com.github.tantalor93.ListNode;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class Solution19 {

	// pouziti dvou ukazatelu, udrzuji si dva ukazatele ve vzdalenosti N
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode it = head;
		ListNode prev = head;
		var dist = 1;
		while(it != null && it.next != null) {
			if(dist > n) {
				prev = prev.next;
				dist--;
			}
			it = it.next;
			dist++;
		}
		if(prev == head && dist == n) {
			return head.next;
		} else if(prev.next != null){
			prev.next = prev.next.next;
		}

		return head;
	}
}
