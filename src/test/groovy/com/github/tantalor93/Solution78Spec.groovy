package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification

class Solution78Spec extends Specification {

    @Shared
    def instance = new Solution78()

    def "should find all subsets of set #set"(int[] set, def expected) {
        expect:
        instance.subsets(set) as Set == expected as Set

        where:
        set       | expected
        [1, 2, 3] | [[3], [1], [2], [1, 2, 3], [1, 3], [2, 3], [1, 2], []]
        []        | [[]]
        [1]       | [[], [1]]
    }
}
