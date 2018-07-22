package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution100Spec extends Specification {

    @Shared
    def instance = new Solution100()

    @Unroll
    def "is same tree #left #right #expected"(Integer[] left, Integer[] right, def expected) {
        given:
        def leftTree = TreeNode.buildFromArray(left)
        def rightTree = TreeNode.buildFromArray(right)

        expect:
        instance.isSameTree(leftTree, rightTree) == expected

        where:
        left          | right                        | expected
        [1, 2, 3]     | [1, 2, 3]                    | true
        [1, 2]        | [1, null, 2]     | false
        []            | []                           | true
        [6, 4, 10, 1] | [6, 4, 10, 1, null, null, 7] | false

    }
}
