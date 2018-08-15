package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution104Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution104()

    @Unroll
    def "should find max depth of tree [#tree]"() {

        expect:
        instance.maxDepth(tree) == expected

        where:
        tree                                   | expected
        newTree([3, 9, 20, null, null, 15, 7]) | 3
        newTree([3, 9, 20])                    | 2
        newTree([3])                           | 1
        newTree([])                            | 0

    }
}
