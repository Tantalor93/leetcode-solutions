package com.github.tantalor93;

public class BinarySearch {

	public static int binarySearch(int[] array, int value) {
		var left = 0;
		var right = array.length - 1;
		while (left <= right) {
			var mid = left + (right - left) / 2;
			if (array[mid] == value) {
				return mid;
			}
			if (array[mid] < value) {
				left = mid + 1;
			} else if (array[mid] > value) {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static int binarySearchRec(int[] array, int value) {
		return binarySearchRec(array, 0, array.length-1, value);
	}

	private static int binarySearchRec(int[] array, int left, int right, int value) {
		if (left > right) {
			return -1;
		}

		var mid = left + (right - left) / 2;
		if (array[mid] == value) {
			return mid;
		}
		if (array[mid] < value) {
			return binarySearchRec(array, mid+1, right, value);
		} else {
			return binarySearchRec(array, left, mid-1, value);
		}
	}
}
