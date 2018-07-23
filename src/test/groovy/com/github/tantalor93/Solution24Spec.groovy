package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution24Spec extends Specification {

    @Shared
    private instance = new Solution24()

    @Unroll
    def "should swap pairs in list #list"(ListNode list, ListNode expected) {
        expect:
        instance.swapPairs(list) == expected

        where:
        list                                      | expected
        ListNode.fromArray([1, 2, 3, 4] as int[]) | ListNode.fromArray([2, 1, 4, 3] as int[])
        ListNode.fromArray([1, 2, 3] as int[])    | ListNode.fromArray([2, 1, 3] as int[])
        ListNode.fromArray([] as int[])           | ListNode.fromArray([] as int[])
    }
}
