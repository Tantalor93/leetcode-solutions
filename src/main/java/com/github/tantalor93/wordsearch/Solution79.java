package com.github.tantalor93.wordsearch;

public class Solution79 {

	public boolean exist(char[][] board, String word) {
		var visited = new boolean[board.length][board[0].length];
		var result = false;
		for (var i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				result |= backtrack(board, word, i, j, 0, visited);
			}
		}
		return result;
	}

	private boolean backtrack(char[][] board, String word, int i, int j, int wordIndex, boolean[][] visited) {
		if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
			return false;
		}
		if (visited[i][j]) {
			return false;
		}
		if (word.charAt(wordIndex) != board[i][j]) {
			return false;
		}
		if (word.length() - 1 == wordIndex) {
			return true;
		}
		visited[i][j] = true;
		boolean result = backtrack(board, word, i + 1, j, wordIndex + 1, visited)
				| backtrack(board, word, i, j + 1, wordIndex + 1, visited)
				| backtrack(board, word, i - 1, j, wordIndex + 1, visited)
				| backtrack(board, word, i, j - 1, wordIndex + 1, visited);
		visited[i][j] = false;
		return result;
	}
}
