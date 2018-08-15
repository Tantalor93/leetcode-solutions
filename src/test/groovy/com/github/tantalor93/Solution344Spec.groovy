package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution344Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution344()

    @Unroll
    def "should reverse string #string"() {
        expect:
        instance.reverseString(string) == expected

        where:
        string       | expected
        'ahoj'       | 'joha'
        'ahoj petre' | 'ertep joha'
        '   '        | '   '
        null         | null
    }
}
