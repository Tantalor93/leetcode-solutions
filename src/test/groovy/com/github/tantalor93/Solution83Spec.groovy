package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution83Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution83()

    @Unroll
    def "should delete all duplicates of list #list"(ListNode list, ListNode expected) {
        given:

        expect:
        instance.deleteDuplicates(list) == expected

        where:
        list                     | expected
        newList([1, 1, 2])       | newList([1, 2])
        newList([1, 1, 2, 3, 3]) | newList([1, 2, 3])
        newList([1, 2, 3])       | newList([1, 2, 3])
        newList([])              | newList([])
        newList([1])             | newList([1])
    }
}
