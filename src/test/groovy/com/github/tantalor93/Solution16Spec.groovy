package com.github.tantalor93

import spock.lang.Unroll

class Solution16Spec extends SolutionSpecification {

    @Unroll
    def "find closest three sum in array #array to target #target"() {

        expect:
        Solution16.threeSumClosest(array as int[], target) == expected

        where:
        array                         | target | expected
        [1, 2, 4, 8, 16, 32, 64, 128] | 82     | 82
        [-3, -2, -5, 3, -4]           | -1     | -2
        [-1, 2, 1, -4]                | 1      | 2
        [-1, 2, 0, -1]                | 0      | 0
    }
}
