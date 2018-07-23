package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution21Spec extends Specification {

    @Shared
    def instance = new Solution21()

    @Unroll
    def "merge two lists [#list1] [#list2]"(def list1, def list2, def expected) {
        expect:
        instance.mergeTwoLists(list1, list2) == expected

        where:
        list1                                  | list2                                     | expected
        ListNode.fromArray([1, 2, 4] as int[]) | ListNode.fromArray([1, 3, 4] as int[])    | ListNode.fromArray([1, 1, 2, 3, 4, 4] as int[])
        ListNode.fromArray([2, 4] as int[])    | ListNode.fromArray([3, 4, 5, 6] as int[]) | ListNode.fromArray([2, 3, 4, 4, 5, 6] as int[])
        ListNode.fromArray([] as int[])        | ListNode.fromArray([3, 4, 5, 6] as int[]) | ListNode.fromArray([3, 4, 5, 6] as int[])
        ListNode.fromArray([] as int[])        | ListNode.fromArray([] as int[])           | ListNode.fromArray([] as int[])
    }
}
