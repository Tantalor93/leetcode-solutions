package com.github.tantalor93

import spock.lang.Unroll

class Solution18Spec extends SolutionSpecification {

    @Unroll
    def "should find 4sum in #array for #target"() {
        expect:
        Solution18.fourSum(array as int[], target).size() == expected

        where:
        array                      | target | expected
        [-1,2,2,-5,0,-1,4] | 3 | 2

        [0, 0, 0, 0]               | 0      | 1

        [5, 5, 3, 5, 1, -5, 1, -2] | 4      | 1
        [0, 0, 0, 0]               | 1      | 0
    }
}
