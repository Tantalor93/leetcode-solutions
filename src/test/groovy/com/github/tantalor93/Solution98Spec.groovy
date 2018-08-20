package com.github.tantalor93

import spock.lang.Unroll

class Solution98Spec extends SolutionSpecification {

    @Unroll
    def "should validate BST #tree"() {
        expect:
        Solution98.isValidBST(tree) == expected

        where:
        tree                                    | expected
        newTree([2, 1, 3])                      | true
        newTree([10, 5, 15, null, null, 6, 20]) | false
        newTree([5, 1, 4, null, null, 3, 6])    | false
        newTree([1])                            | true
    }
}
