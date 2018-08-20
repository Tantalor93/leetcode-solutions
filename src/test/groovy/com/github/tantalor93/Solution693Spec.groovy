package com.github.tantalor93

import spock.lang.Unroll

class Solution693Spec extends SolutionSpecification {

    @Unroll
    def "check whether number #n has alternating bits"() {
        expect:
        Solution693.hasAlternatingBits(n) == expected

        where:
        n  | expected
        10 | true

        1  | true
        5  | true
        7  | false
        11 | false
    }
}
