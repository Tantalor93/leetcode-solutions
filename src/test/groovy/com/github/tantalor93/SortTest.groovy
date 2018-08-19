package com.github.tantalor93

import spock.lang.Unroll

class SortTest extends SolutionSpecification {

    @Unroll
    def "should sort #array using bubble sort"() {
        when:
        int[] result = Sort.bubbleSort(array as int[])

        then:
        result == expected as int[]

        where:
        array << [[1, 2, 3, 4, 5], [2, 1, 5, 4, 3], [3, 3, 3, 3, 3], [], [1], [5, 4, 3, 2, 1]]

        expected << [[1, 2, 3, 4, 5], [1, 2, 3, 4, 5], [3, 3, 3, 3, 3], [], [1], [1, 2, 3, 4, 5]]
    }

    @Unroll
    def "should sort #array using insert sort"() {
        when:
        int[] result = Sort.insertSort(array as int[])

        then:
        result == expected as int[]

        where:
        array << [[1, 2, 3, 4, 5], [2, 1, 5, 4, 3], [3, 3, 3, 3, 3], [], [1], [5, 4, 3, 2, 1]]

        expected << [[1, 2, 3, 4, 5], [1, 2, 3, 4, 5], [3, 3, 3, 3, 3], [], [1], [1, 2, 3, 4, 5]]
    }

    @Unroll
    def "should sort #array using quick sort"() {
        when:
        int[] result = Sort.quickSort(array as int[])

        then:
        result == expected as int[]

        where:
        array << [[1, 2, 3, 4, 5], [2, 1, 5, 4, 3], [3, 3, 3, 3, 3], [], [1], [5, 4, 3, 2, 1]]

        expected << [[1, 2, 3, 4, 5], [1, 2, 3, 4, 5], [3, 3, 3, 3, 3], [], [1], [1, 2, 3, 4, 5]]
    }
}
