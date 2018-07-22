package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution112Spec extends Specification {

    @Shared
    def instance = new Solution112()

    @Unroll
    def "test path sum #sum of tree #treeArray"(Integer[] treeArray, int sum, def expected) {
        given:
        def tree = TreeNode.buildFromArray(treeArray)

        expect:
        instance.hasPathSum(tree, sum) == expected

        where:
        treeArray                                             | sum | expected
        [5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1] | 22  | true
        [3, 9, 2, 20]                                         | 1   | false
        [3, 9, 2, 20]                                         | 5   | true
    }
}
