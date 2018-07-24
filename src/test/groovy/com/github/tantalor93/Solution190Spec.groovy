package com.github.tantalor93

import spock.lang.Shared

class Solution190Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution190()

    def "should reverse bits of #n"(def n, def expected) {
        expect:
        instance.reverseBits(n) == expected

        where:
        n        | expected
        43261596 | 964176192
    }
}
