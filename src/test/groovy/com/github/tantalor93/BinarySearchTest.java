package com.github.tantalor93;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class BinarySearchTest {

	@ParameterizedTest
	@MethodSource("parameters")
	void testBinarySearch(int[] array, int value, int expected) {
		assertEquals(BinarySearch.binarySearch(array, value), expected);
	}

	@ParameterizedTest
	@MethodSource("parameters")
	void testBinarySearchRec(int[] array, int value, int expected) {
		assertEquals(BinarySearch.binarySearchRec(array, value), expected);
	}

	static Object[][] parameters() {
		return new Object[][] {
				{ new int[] { 2, 4, 5, 7, 9, 13, 19 }, 5, 2 },
				{ new int[] { 2, 4, 5, 7, 9, 13, 19 }, 1, -1 },
				{ new int[] {}, 1, -1 },
		};
	}
}
