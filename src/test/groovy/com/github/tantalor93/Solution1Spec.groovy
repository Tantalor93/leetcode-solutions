package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification

class Solution1Spec extends Specification {

    @Shared
    def instance = new Solution1()

    def "test two sum"() {
        expect:
        instance.twoSum((int[]) [2, 7, 11, 15], 9) == [0, 1]
    }
}
