package com.github.tantalor93;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SortTest {

	@Test
	public void testQuickSort() {
		int[] ints = { 3, 5, 4, 2, 1 };
		Sort.quickSort(ints);
		assertThat(ints, equalTo(new int[] { 1, 2, 3, 4, 5 }));

		ints = new int[] { 1, 2, 3, 4, 5 };
		Sort.quickSort(ints);
		assertThat(ints, equalTo(new int[] { 1, 2, 3, 4, 5 }));

		ints = new int[] { 5, 4, 3, 2, 1 };
		Sort.quickSort(ints);
		assertThat(ints, equalTo(new int[] { 1, 2, 3, 4, 5 }));
	}

	@Test
	public void testMergeSort() {
		int[] ints = { 3, 5, 4, 2, 1 };
		assertThat(Sort.mergeSort(ints), equalTo(new int[] { 1, 2, 3, 4, 5 }));

		ints = new int[] { 1, 2, 3, 4, 5 };
		assertThat(Sort.mergeSort(ints), equalTo(new int[] { 1, 2, 3, 4, 5 }));

		ints = new int[] { 5, 4, 3, 2, 1 };
		assertThat(Sort.mergeSort(ints), equalTo(new int[] { 1, 2, 3, 4, 5 }));
	}
}
