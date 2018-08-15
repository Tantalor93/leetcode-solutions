package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution50Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution50()

    @Unroll
    def "should raise #x to power #n"() {
        expect:
        instance.myPow(x, n).trunc(3) == (expected as double).trunc(3)

        where:
        x   | n  | expected
        2.0 | 10 | 1024
        2.1 | 3  | 9.26100
        2.0 | -2 | 0.25000
    }
}
