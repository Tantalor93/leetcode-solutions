package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution226Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution226()

    @Unroll
    def "should invert tree [#tree]"() {
        expect:
        instance.invertTree(tree) == expected

        where:
        tree                           | expected
        newTree([4, 2, 7, 1, 3, 6, 9]) | newTree([4, 7, 2, 9, 6, 3, 1])
        newTree([])                    | newTree([])
        newTree([1])                   | newTree([1])
        newTree([1, 3])                | newTree([1, null, 3])

    }
}
