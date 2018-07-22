package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution83Spec extends Specification {

    @Shared
    def instance = new Solution83()

    @Unroll
    def "should delete all duplicates of list #list"(ListNode list, ListNode expected) {
        given:

        expect:
        instance.deleteDuplicates(list) == expected

        where:
        list                                         | expected
        ListNode.fromArray([1, 1, 2] as int[])       | ListNode.fromArray([1, 2] as int[])
        ListNode.fromArray([1, 1, 2, 3, 3] as int[]) | ListNode.fromArray([1, 2, 3] as int[])
        ListNode.fromArray([1, 2, 3] as int[])       | ListNode.fromArray([1, 2, 3] as int[])
        ListNode.fromArray([] as int[])              | ListNode.fromArray([] as int[])
        ListNode.fromArray([1] as int[])             | ListNode.fromArray([1] as int[])
    }
}
