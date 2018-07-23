package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution100Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution100()

    @Unroll
    def "is same tree left=[#left] right=[#right]"(TreeNode left, TreeNode right, def expected) {

        expect:
        instance.isSameTree(left, right) == expected

        where:
        left                   | right                                 | expected
        newTree([1, 2, 3])     | newTree([1, 2, 3])                    | true
        newTree([1, 2])        | newTree([1, null, 2])                 | false
        newTree([])            | newTree([])                           | true
        newTree([6, 4, 10, 1]) | newTree([6, 4, 10, 1, null, null, 7]) | false

    }
}
