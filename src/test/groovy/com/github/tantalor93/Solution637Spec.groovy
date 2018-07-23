package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution637Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution637()

    @Unroll
    def "should calculate average of levels in binary tree [#tree]"(TreeNode tree, def expected) {
        expect:
        instance.averageOfLevels(tree) == expected

        where:
        tree                                          | expected
        newTree([3, 9, 20, null, null, 15, 7])        | [3, 14.5, 11]
        newTree([2147483647, 2147483647, 2147483647]) | [2147483647, 2147483647]
        newTree([])                                   | []
        newTree([1])                                  | [1]
    }
}
