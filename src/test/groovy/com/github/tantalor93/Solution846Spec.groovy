package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Solution846Spec extends Specification {

    @Shared
    def instance = new Solution846()

    @Unroll
    def "has hand #array of straights of size [#size]"(int[] array, int size, def expect) {
        expect:
        instance.isNStraightHand(array, size) == expect

        where:
        array                       | size | expect
        [1, 2, 3, 6, 2, 3, 4, 7, 8] | 3    | true
        [1, 2, 3, 4, 5]             | 4    | false

    }
}
