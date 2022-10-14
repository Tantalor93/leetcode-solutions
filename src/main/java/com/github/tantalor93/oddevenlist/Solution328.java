package com.github.tantalor93.oddevenlist;

import java.util.ArrayList;

import com.github.tantalor93.ListNode;

// https://leetcode.com/problems/odd-even-linked-list/description/
public class Solution328 {

	// budu iterovat pres seznam a pamatovat si predchozi node v seznamu a pokazde spojim predchozi se soucasnym nasledujicim, a soucasny s
	// naslednym nasledujicim, pak si budu pamatovat celkovou velikost seznamu a spojim posledni prvek licheho seznamu s prvnim sudeho
	public ListNode oddEvenList(ListNode head) {
		if(head == null) {
			return head;
		}
		if(head.next == null) {
			return head;
		}

		var oddhead = head;
		var evenhead = head.next;

		ListNode prev = null;
		var it = head;
		var size = 1;
		while(it.next != null) {
			size++;
			var next = it.next;
			if(prev != null) {
				prev.next = it.next;
			}
			if(it.next != null) {
				it.next = it.next.next;
			}
			prev = it;
			it = next;
		}
		if(size%2 == 1) {
			it.next = evenhead;
		} else {
			prev.next = evenhead;
		}

		return oddhead;
	}
}
