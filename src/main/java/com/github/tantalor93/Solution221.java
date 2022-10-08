package com.github.tantalor93;

public class Solution221 {

	// reseno pomoci dynamickeho programovani, memoizuji predchozi vysledky a soucasnou hodnotu spocitam jako
	// mem[i][j]=min([i-1][j],[i][j-1],[i-1][j-1])+1
	// konecnej vysledek sopcitam jako maximum ze vsech mem[i][j]
	public int maximalSquare(char[][] matrix) {
		int[][] mem = new int[matrix.length][matrix[0].length];
		int max = 0;
		for(var i = 0; i < matrix.length; i++) {
			for(var j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] =='1') {
					var minup = i - 1 < 0 ? 0 : mem[i - 1][j];
					var minleft = j - 1 < 0 ? 0 : mem[i][j - 1];
					var mincross = i - 1 < 0 || j - 1 < 0 ? 0 : mem[i - 1][j - 1];
					mem[i][j] = Math.min(Math.min(minup, minleft), mincross) + 1;
					max = Math.max(mem[i][j], max);
				}
			}
		}
		return max * max;
	}
}
