package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution617Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution617()

    @Unroll
    def "should merge tree #t1 with tree #t2"(def t1, def t2, def expected) {
        expect:
        instance.mergeTrees(t1, t2) == expected

        where:
        t1                    | t2                                   | expected
        newTree([1, 3, 2, 5]) | newTree([2, 1, 3, null, 4, null, 7]) | newTree([3, 4, 5, 5, 4, null, 7])
        newTree([])           | newTree([])                          | newTree([])
        newTree([1])          | newTree([])                          | newTree([1])
        newTree([1, 3, 2])    | newTree([1])                         | newTree([2, 3, 2])
    }

}
