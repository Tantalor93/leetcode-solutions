package com.github.tantalor93

import spock.lang.Shared
import spock.lang.Unroll

class Solution139Spec extends SolutionSpecification {

    @Shared
    def instance = new Solution139()

    @Unroll
    def "word #w can be segmented into array #array"() {
        expect:
        instance.wordBreak(w, array) == expected

        where:
        w               | array                                                                                           | expected
        "leetcode"      | ["leet", "code"]                                                                                | true
        "applepenapple" | ["apple", "pen"]                                                                                | true
        "catsandog"     | ["cats", "dog", "sand", "and", "cat"]                                                           | false
        "catsat"        | ["sat", "cats", "cat"]                                                                          | true
        longString()    | ["a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"] | false

    }

    private String longString() {
        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"
    }
}
