package com.github.tantalor93

import spock.lang.Unroll

class Solution15Test extends SolutionSpecification {

    @Unroll
    def "should find three sum in #array"() {
        expect:
        Solution15.threeSum(array as int[]) as Set == expected as Set

        where:
        array                 | expected
        [-2, 0, 0, 2, 2]      | [[-2, 0, 2]]
        [-1, 0, 1, 2, -1, -4] | [[-1, 0, 1], [-1, -1, 2]]
    }
}
