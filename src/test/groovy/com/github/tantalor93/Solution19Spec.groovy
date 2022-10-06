package com.github.tantalor93


import spock.lang.Unroll

class Solution19Spec extends SolutionSpecification {


    @Unroll
    def "remove nth #l with #n"() {
        expect:
        Solution19.removeNthFromEnd(l, n) == expected

        where:
        l                  | n | expected
        newList([2, 4, 3]) | 2 | newList([2, 3])
        newList([1])       | 1 | newList([])
    }
}
