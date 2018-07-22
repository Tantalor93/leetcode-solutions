package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution112Spec extends Specification {

    @Shared
    def instance = new Solution112()

    @Unroll
    def "test path sum #sum of tree [#tree]"(TreeNode tree, int sum, def expected) {
        expect:
        instance.hasPathSum(tree, sum) == expected

        where:
        tree                                                                                        | sum | expected
        TreeNode.buildFromArray([5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1] as Integer[]) | 22  | true
        TreeNode.buildFromArray([3, 9, 2, 20] as Integer[])                                         | 1   | false
        TreeNode.buildFromArray([3, 9, 2, 20] as Integer[])                                         | 5   | true
    }
}
