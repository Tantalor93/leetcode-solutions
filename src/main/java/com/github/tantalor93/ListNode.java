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

    @Override
    public String toString() {
        final StringBuilder strb = new StringBuilder();
        strb.append("[");
        ListNode node = this;
        strb.append(node.val);
        node = node.next;
        while (node != null) {
            strb.append(", ").append(node.val);
            node = node.next;
        }
        strb.append("]");
        return strb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
