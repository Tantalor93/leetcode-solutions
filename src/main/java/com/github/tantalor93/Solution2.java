package com.github.tantalor93;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int trans = 0;

        ListNode result = null;
        ListNode current = null;

        ListNode l1Current = l1;
        ListNode l2Current = l2;

        while(l1Current != null || l2Current != null || trans != 0){
            if(l1Current == null && l2Current == null) {
                current.next = new ListNode(trans);
                current = current.next;
            }
            else if(l1Current != null && l2Current == null) {
                current.next = new ListNode((l1Current.val+trans)%10);
                current = current.next;
            }
            else if(l2Current != null && l1Current == null) {
                current.next = new ListNode((l2Current.val+trans)%10);
                current = current.next;
            }
            else {

                ListNode newNode = new ListNode((l1Current.val+l2Current.val+trans)%10);



                if(result == null) {
                    current = newNode;
                    result = current;
                } else {
                    current.next = newNode;
                    current = current.next;
                }
            }

            if(((l1Current == null)? 0 : l1Current.val) + ((l2Current == null)? 0 : l2Current.val) + trans>= 10) {
                trans = 1;
            }
            else {
                trans = 0;
            }

            if(l1Current != null){
                l1Current = l1Current.next;
            }
            if(l2Current != null){
                l2Current = l2Current.next;
            }
        }
        return result;
    }
}
