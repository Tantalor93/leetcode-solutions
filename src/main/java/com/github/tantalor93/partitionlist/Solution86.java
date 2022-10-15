package com.github.tantalor93.partitionlist;

import com.github.tantalor93.ListNode;

// https://leetcode.com/problems/partition-list/description/
public class Solution86 {
	public ListNode partition(ListNode head, int x) {
		var it = head;
		ListNode lesshead = null;
		ListNode morehead = null;
		ListNode lessit = null;
		ListNode moreit = null;
		while(it != null) {
			var next = it.next;
			if(it.val < x) {
				if(lesshead == null) {
					lesshead = it;
				}
				if(lessit != null) {
					lessit.next = it;
					lessit = lessit.next;
				} else {
					lessit = it;
				}
			} else {
				if(morehead == null) {
					morehead = it;
				}
				if(moreit != null) {
					moreit.next = it;
					moreit = moreit.next;
				} else {
					moreit = it;
				}
			}
			it = next;
		}
		if(moreit != null) {
			moreit.next = null;
		}
		if(lessit != null) {
			lessit.next = morehead;
		}
		if(lesshead == null) {
			return morehead;
		}
		return lesshead;
	}

}
