package com.github.tantalor93

import spock.lang.Specification
import spock.lang.Unroll


class Solution729Spec extends Specification {

    @Unroll
    def "should book"(List<Tuple> intervals, List<Boolean> expected) {
        setup:
        def calendar = new Solution729.MyCalendar()

        expect:
        for (int i = 0; i < intervals.size(); i++) {
            calendar.book(intervals.get(i)[0], intervals.get(i)[1]) == expected[i]
        }

        where:
        intervals                                                                                     | expected
        [new Tuple(10, 20), new Tuple(15, 25), new Tuple(20, 30)]                                     | [true, false, true]
        [new Tuple(37, 50), new Tuple(33, 50), new Tuple(4, 17), new Tuple(35, 48), new Tuple(8, 25)] | [true, false, true, false, false]
    }
}