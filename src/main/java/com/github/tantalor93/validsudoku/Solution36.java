package com.github.tantalor93.validsudoku;

// https://leetcode.com/problems/valid-sudoku/
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
