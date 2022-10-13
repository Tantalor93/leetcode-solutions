package com.github.tantalor93.palindromelinkedlist;

import com.github.tantalor93.ListNode;

// https://leetcode.com/problems/palindrome-linked-list/description/
public class Solution234 {

	// rozdelim si list na dve poloviny, druhou polovinu pak inplace reversnu a pak budu iterovat a kontrolovat zda je to palindrom
	public boolean isPalindrome(ListNode head) {
		var len = 0;
		var it = head;
		while(it != null) {
			it = it.next;
			len++;
		}
		if(len == 1) {
			return true;
		}
		ListNode prev = null;
		var mid = head;
		for(var i = 0; i < len/2; i++) {
			prev = mid;
			mid = mid.next;
		}
		prev.next = null;

		if(len%2 == 1) {
			mid = mid.next;
		}
		it = mid;
		prev = null;
		while(it != null) {
			var next = it.next;
			it.next = prev;
			prev = it;
			it = next;
		}

		var it1 = prev;
		var it2 = head;
		while(it1 != null && it2 != null) {
			if(it1.val != it2.val) {
				return false;
			}
			it1 = it1.next;
			it2 = it2.next;
		}
		if(it1 != null || it2 != null) {
			return false;
		}
		return true;
	}
}
