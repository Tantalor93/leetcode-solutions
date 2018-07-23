package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution21Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution21()

    @Unroll
    def "merge two lists [#list1] [#list2]"(def list1, def list2, def expected) {
        expect:
        instance.mergeTwoLists(list1, list2) == expected

        where:
        list1              | list2                 | expected
        newList([1, 2, 4]) | newList([1, 3, 4])    | newList([1, 1, 2, 3, 4, 4])
        newList([2, 4])    | newList([3, 4, 5, 6]) | newList([2, 3, 4, 4, 5, 6])
        newList([])        | newList([3, 4, 5, 6]) | newList([3, 4, 5, 6])
        newList([])        | newList([])           | newList([])
    }
}
