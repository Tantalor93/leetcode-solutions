package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution26Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution26()

    @Unroll
    def "should remove duplicates from array #array"(int[] array, int[] expected) {
        given:
        def tmp = array

        when:
        def length = instance.removeDuplicates(tmp)

        then:
        length == expected.length
        (tmp as List).take(length) == expected

        where:
        array                          | expected
        [1, 1, 2]                      | [1, 2]
        [0, 0, 1, 1, 1, 2, 2, 3, 3, 4] | [0, 1, 2, 3, 4]
        []                             | []
        [1]                            | [1]
    }
}
