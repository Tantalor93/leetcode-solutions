package com.github.tantalor93.matrixzeroes;

public class Solution73 {


	/* aby jsme docilili in-place solution, tak vyuzijeme nulty radek a nulty sloupec k tomu, aby jsme si zapamatovali, ktery sloupce a radky nulovat

	 */
	public void setZeroes(int[][] matrix) {
		var zerorow = false;
		var zerocolumn = false;

		// projdeme maticu a vynulujem nulty radek/sloupec podle toho zda je dany prvek 0, zaroven si zapamatujeme, kdyz mame nulovat nulty radek/sloupec
		for (var i = 0; i < matrix.length; i++) {
			for (var j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					if (i == 0) {
						zerorow = true;
					}
					if (j == 0) {
						zerocolumn = true;
					}
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}

		// pak projdeme sub-maticu a koukame, jestli dany prvek mame nulovat podle nulteho radku/sloupce
		for (var i = 1; i < matrix.length; i++) {
			for (var j = 1; j < matrix[0].length; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		// nasledne jeste donulujem nulty radek/sloupec
		if(zerorow) {
			for(int j = 0; j < matrix[0].length; j++) {
				matrix[0][j] = 0;
			}
		}
		if(zerocolumn) {
			for(int i = 0; i < matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}
	}
}
