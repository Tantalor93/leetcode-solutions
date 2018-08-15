package com.github.tantalor93

import spock.lang.Unroll

class ListNodeSpec extends SolutionSpecification {

    @Unroll
    def "should construct list from array #array"() {
        expect:
        newList(array) == expected

        where:
        array     | expected
        [1, 2, 3] | list()
        []        | null
        [1]       | new ListNode(1)
    }

    @Unroll
    def "should properly build String from list #listNode"() {
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
