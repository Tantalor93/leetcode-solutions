package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll


class Solution344Spec extends Specification {

    @Shared
    def instance = new Solution344()

    @Unroll
    def "should reverse string #string"(def string, def expected) {
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
