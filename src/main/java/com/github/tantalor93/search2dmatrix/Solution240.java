package com.github.tantalor93.search2dmatrix;

// https://leetcode.com/problems/search-a-2d-matrix-ii/
public class Solution240 {
	// iteruji pres prvni radek a na sloupce ktere by mohli obsahovat vysledek aplikuji binary search = O(m*logn) complexity
	public boolean searchMatrix(int[][] matrix, int target) {
		for(int i = 0; i < matrix[0].length; i++) {
			if(matrix[matrix.length-1][i] >= target) {
				if(binarysearch(matrix,i,target)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean binarysearch(int[][] matrix, int column, int target) {
		var left = 0;
		var right = matrix.length-1;
		while(left <= right) {
			var mid = (left+right)/2;
			if(matrix[mid][column] == target) {
				return true;
			} else if(matrix[mid][column] > target) {
				right = mid-1;
			} else {
				left = mid+1;
			}
		}
		return false;
	}
}
