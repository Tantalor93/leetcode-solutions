package com.github.tantalor93.validsudoku;

/*
Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.

A partially filled sudoku which is valid.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

Example 1:

Input:
[
  ["5","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
Output: true
Example 2:

Input:
[
  ["8","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being
    modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
The given board contain only digits 1-9 and the character '.'.
The given board size is always 9x9.
 */
public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board[0].length; i++) {
            boolean[] presentRow = new boolean[10];
            boolean[] presentColumn = new boolean[10];
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == '.') continue;
                int val = Character.getNumericValue(board[i][j]);
                if(presentRow[val] != false) return false;
                presentRow[val] = true;
            }

            for(int j = 0; j < board[0].length; j++) {
                if(board[j][i] == '.') continue;
                int val = Character.getNumericValue(board[j][i]);
                if(presentColumn[val] != false) return false;
                presentColumn[val] = true;
            }
        }

        for(int i = 0; i < 3; i++){
            for(int i2 = 0; i2 < 3; i2 ++){
                boolean[] present = new boolean[10];
                for(int j = 0; j < 3; j++) {
                    for(int k = 0; k < 3; k++) {
                        if(board[i*3+j][i2*3+k] == '.') continue;
                        int val = Character.getNumericValue(board[i*3+j][i2*3+k]);
                        if(present[val] != false) return false;
                        present[val] = true;
                    }
                }
            }
        }

        return true;
    }
}
