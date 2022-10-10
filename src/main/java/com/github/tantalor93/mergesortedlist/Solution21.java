package com.github.tantalor93.mergesortedlist;

import com.github.tantalor93.ListNode;

/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

 */
public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode itL1 = l1;
        ListNode itL2 = l2;

        ListNode res = null;
        ListNode itRes = null;

        while(itL1 != null && itL2 != null) {
            if(itL1.val < itL2.val) {
                if(res == null) {
                    res = new ListNode(itL1.val);
                    itRes = res;
                }
                else {
                    itRes.next = new ListNode(itL1.val);
                    itRes = itRes.next;
                }
                itL1 = itL1.next;
            }
            else {
                if(res == null) {
                    res = new ListNode(itL2.val);
                    itRes = res;
                }
                else {
                    itRes.next = new ListNode(itL2.val);
                    itRes = itRes.next;
                }
                itL2 = itL2.next;
            }
        }
        if(itL1 != null) {
            if(res == null) {
                res = itL1;
            }
            else{
                itRes.next = itL1;
            }
        }
        else if(itL2 != null) {
            if(res == null) {
                res = itL2;
            }
            else{
                itRes.next = itL2;
            }
        }
        return res;
    }
}
