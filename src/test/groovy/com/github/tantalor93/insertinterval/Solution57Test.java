package com.github.tantalor93.insertinterval;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class Solution57Test {

	@ParameterizedTest
	@MethodSource("parameters")
	void test(int[][] intervals, int[] toInsert, int[][] expected) {
		Assertions.assertThat(Solution57.insert(intervals, toInsert))
				.isDeepEqualTo(expected);
	}

	static Object[][] parameters() {
		return new Object[][] {
				{ new int[][] { { 1, 5 } }, new int[] { 0, 3 }, new int[][] { { 0, 5 } } },
				{ new int[][] { { 1, 5 } }, new int[] { 2, 3 }, new int[][] { { 1, 5 } } },
				{ new int[][] {}, new int[] { 2, 5 }, new int[][] { { 2, 5 } } },
				{ new int[][] { { 1, 3 }, { 6, 9 } }, new int[] { 2, 5 }, new int[][] { { 1, 5 }, { 6, 9 } } }
		};
	}
}
