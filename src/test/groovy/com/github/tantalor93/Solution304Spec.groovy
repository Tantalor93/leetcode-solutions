package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution304Spec extends SolutionSpecification {

    static final int[][] matrix = [
            [3, 0, 1, 4, 2],
            [5, 6, 3, 2, 1],
            [1, 2, 0, 1, 5],
            [4, 1, 0, 1, 7],
            [1, 0, 3, 0, 5]
    ]

    @Shared
    def instance = new Solution304.NumMatrix(matrix)

    @Unroll
    def "should find sum of range (#t) in matrix"() {

        expect:
        instance.sumRegion(t.get(0), t.get(1), t.get(2), t.get(3)) == expected


        where:
        t                     | expected
        new Tuple(2, 1, 4, 3) | 8
        new Tuple(1, 1, 2, 2) | 11
        new Tuple(1, 2, 2, 4) | 12
    }
}
