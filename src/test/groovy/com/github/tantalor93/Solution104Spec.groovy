package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution104Spec extends Specification {

    @Shared
    def instance = new Solution104()

    @Unroll
    def "should find max depth #expected of tree #treeArray"(Integer[] treeArray, int expected) {
        given:
        def tree = TreeNode.buildFromArray(treeArray)

        expect:
        instance.maxDepth(tree) == expected

        where:
        treeArray                     | expected
        [3, 9, 20, null, null, 15, 7] | 3
        [3, 9, 20]                    | 2
        [3]                           | 1
        []                            | 0

    }
}
