package com.github.tantalor93

import spock.lang.Specification
import spock.lang.Unroll

class ListNodeSpec extends Specification {

    @Unroll
    def "should construct list from array #array"(int[] array, ListNode expected) {
        expect:
        ListNode.fromArray(array) == expected

        where:
        array     | expected
        [1, 2, 3] | list()
        []        | null
        [1]       | new ListNode(1)
    }

    @Unroll
    def "should properly build String from list #listNode"(ListNode listNode, String s) {
        expect:
        listNode.toString() == s

        where:
        listNode        | s
        list()          | "1, 2, 3"
        new ListNode(1) | "1"
    }

    def list() {
        final ListNode listNode = new ListNode(1)
        listNode.next = new ListNode(2)
        listNode.next.next = new ListNode(3)
        return listNode
    }
}
