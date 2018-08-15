package com.github.tantalor93

import spock.lang.Shared


class Solution78Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution78()

    def "should find all subsets of set #set"() {
        expect:
        instance.subsets(set as int[]) as Set == expected as Set

        where:
        set       | expected
        [1, 2, 3] | [[3], [1], [2], [1, 2, 3], [1, 3], [2, 3], [1, 2], []]
        []        | [[]]
        [1]       | [[], [1]]
    }
}
