package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution771Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution771()

    @Unroll
    def "should find jewels #jewels in stones #stones"() {
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