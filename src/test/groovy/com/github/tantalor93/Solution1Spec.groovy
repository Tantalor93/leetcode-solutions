package com.github.tantalor93

import spock.lang.Shared


class Solution1Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution1()

    def "test two sum"() {
        expect:
        instance.twoSum([2, 7, 11, 15] as int[], 9) == [0, 1]
    }
}
