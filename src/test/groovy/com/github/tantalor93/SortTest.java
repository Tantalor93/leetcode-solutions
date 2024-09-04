package com.github.tantalor93;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTest {

	@Test
	public void testQuickSort() {
		int[] ints = { 3, 5, 4, 2, 1 };
		Sort.quickSort(ints);
		Assertions.assertArrayEquals(ints, new int[] { 1, 2, 3, 4, 5 });

		ints = new int[] { 1, 2, 3, 4, 5 };
		Sort.quickSort(ints);
		Assertions.assertArrayEquals(ints, new int[] { 1, 2, 3, 4, 5 });

		ints = new int[] { 5, 4, 3, 2, 1 };
		Sort.quickSort(ints);
		Assertions.assertArrayEquals(ints, new int[] { 1, 2, 3, 4, 5 });
	}

	@Test
	public void testMergeSort() {
		int[] ints = { 3, 5, 4, 2, 1 };
		Assertions.assertArrayEquals(Sort.mergeSort(ints), new int[] { 1, 2, 3, 4, 5 });

		ints = new int[] { 1, 2, 3, 4, 5 };
		Assertions.assertArrayEquals(Sort.mergeSort(ints), new int[] { 1, 2, 3, 4, 5 });

		ints = new int[] { 5, 4, 3, 2, 1 };
		Assertions.assertArrayEquals(Sort.mergeSort(ints), new int[] { 1, 2, 3, 4, 5 });
	}
}
