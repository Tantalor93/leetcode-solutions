package com.github.tantalor93.sortlinkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.github.tantalor93.ListNode;

// https://leetcode.com/problems/sort-list/
public class Solution148 {
	public ListNode sortList(ListNode head) {
		if(head ==  null) {
			return null;
		}
		List<ListNode> list = new ArrayList<>();
		var it = head;
		while(it != null) {
			list.add(it);
			it = it.next;
		}
		Collections.sort(list, Comparator.comparingInt((ListNode o) -> o.val));
		for(var i = 0; i < list.size(); i++) {
			var next = i+1 < list.size() ? list.get(i+1) : null;
			list.get(i).next = next;
		}
		return list.get(0);
	}
}
