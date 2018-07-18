package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll


class Solution771Spec extends Specification {

    @Shared
    def instance = new Solution771()

    @Unroll
    def "should find jewels #jewels in stones #stones"(def jewels, def stones, def expected) {
        expect:
        instance.numJewelsInStones(jewels, stones) == expected

        where:
        jewels | stones    | expected
        'aA'   | 'aAAbbbb' | 3
        'z'    | 'ZZ'      | 0
        ''     | ''        | 0
        ''     | 'aA'      | 0
        'z'    | ''        | 0
    }
}