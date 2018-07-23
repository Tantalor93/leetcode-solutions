package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution112Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution112()

    @Unroll
    def "test path sum #sum of tree [#tree]"(TreeNode tree, int sum, def expected) {
        expect:
        instance.hasPathSum(tree, sum) == expected

        where:
        tree                                                           | sum | expected
        newTree([5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1]) | 22  | true
        newTree([3, 9, 2, 20])                                         | 1   | false
        newTree([3, 9, 2, 20])                                         | 5   | true
    }
}
