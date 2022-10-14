package com.github.tantalor93.deletenodeinlinkedlist;

import com.github.tantalor93.ListNode;

// https://leetcode.com/problems/delete-node-in-a-linked-list/solutions/
public class Solution237 {
   // impersonifikuju nasledujici node a pak ho ho preskocim, tohle bude fungovat diky tomu ze vime ze ten node ktery dostaneme nebude nikdy prvni
	// ani posledni
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
