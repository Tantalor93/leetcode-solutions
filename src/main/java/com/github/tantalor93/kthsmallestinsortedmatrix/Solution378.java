package com.github.tantalor93.kthsmallestinsortedmatrix;

import java.util.Comparator;
import java.util.PriorityQueue;

// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/
public class Solution378 {

	// budu pridavat prvky do max heap a pokud velikost heap presahne K, tak smazu max
	// nakonec head fronty bude Kty nejmensi prvek, slozitost O(m*n*logk)
	public int kthSmallest(int[][] matrix, int k) {
		PriorityQueue<Integer> heap = new PriorityQueue<>(k, Comparator.reverseOrder());
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j< matrix[i].length; j++) {
				heap.add(matrix[i][j]);
				if(heap.size() > k) {
					heap.remove();
				}
			}
		}
		return heap.remove();
	}
}
