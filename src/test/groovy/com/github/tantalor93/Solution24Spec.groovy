package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution24Spec extends SolutionSpecification {

    @Shared
    private instance = new Solution24()

    @Unroll
    def "should swap pairs in list #list"(ListNode list, ListNode expected) {
        expect:
        instance.swapPairs(list) == expected

        where:
        list                  | expected
        newList([1, 2, 3, 4]) | newList([2, 1, 4, 3])
        newList([1, 2, 3])    | newList([2, 1, 3])
        newList([])           | newList([])
    }
}
