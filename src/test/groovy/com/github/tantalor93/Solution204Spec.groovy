package com.github.tantalor93

import spock.lang.Unroll

class Solution204Spec extends SolutionSpecification {

    @Unroll
    def "count primes less then #n"() {
        expect:
        Solution204.countPrimes(n) == expected

        where:
        n  | expected
        10 | 4
    }
}
