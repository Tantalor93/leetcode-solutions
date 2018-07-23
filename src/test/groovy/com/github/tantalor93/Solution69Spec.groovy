package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution69Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution69()

    @Unroll
    def "should calculate sqrt of #x"(int x, int expected) {
        expect:
        instance.mySqrt(x) == expected

        where:
        x | expected
        4 | 2
        8 | 2

    }
}
