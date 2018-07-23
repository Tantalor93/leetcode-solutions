package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution461Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution461()

    @Unroll
    def "should find hamming distance of #x and #y"(int x, int y, int expected) {

        expect:
        instance.hammingDistance(x, y) == expected

        where:
        x     | y  | expected
        1     | 4  | 2
        1     | 1  | 0
        10000 | 33 | 7
    }
}