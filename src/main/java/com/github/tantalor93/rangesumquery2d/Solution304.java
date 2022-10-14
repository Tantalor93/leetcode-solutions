package com.github.tantalor93.rangesumquery2d;

// https://leetcode.com/problems/range-sum-query-2d-immutable/
public class Solution304 {

    public static class NumMatrix {
        private int[][] sums;

        /*
            1 2 3                0 0 0 0
            4 5 6                0 1 3 6
            7 8 9                0 5 12 21
                                 0 12 27 45
         */
        public NumMatrix(int[][] matrix) {
            if (matrix.length == 0 || matrix[0].length == 0) return;
            sums = new int[matrix.length + 1][matrix[0].length + 1];
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[0].length; c++) {
                    sums[r + 1][c + 1] = sums[r + 1][c] + sums[r][c + 1] + matrix[r][c] - sums[r][c];
                }
            }

        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return sums[row2 + 1][col2 + 1] - sums[row1][col2 + 1] - sums[row2 + 1][col1] + sums[row1][col1];
        }
    }
}
