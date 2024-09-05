package com.github.tantalor93;

import java.util.Objects;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode fromArray(int[] array) {
        if (array.length == 0) return null;
        ListNode root = new ListNode(array[0]);
        ListNode listNode = root;
        for (int i = 1; i < array.length; i++) {
            listNode.next = new ListNode(array[i]);
            listNode = listNode.next;
        }
        return root;
    }
}
