package com.practice;

import java.util.*;

public class MatrixValidSudoku {
    public static void main(String args[])
    {

        char[][] board = new char[][]{{'7','.','.','.','4','.','.','.','.'},{'.','.','.','8','6','5','.','.','.'},{'.','1','.','2','.','.','.','.','.'},
                {'.','.','.','.','.','9','.','.','.'},{'.','.','.','.','5','.','5','.','.'},{'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','2','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'}};

        boolean valid = checkValidSudoku(board);
        System.out.println(valid);

    }

    public static boolean checkValidSudoku(char[][]board) {
        Set<String> set = new HashSet<>();
        for (int row = 0; row <= board.length-1; row++) {
            for (int col = 0; col <= row; col++) {
                if (board[row][col] != '.')
                {
                    if (!set.add(board[row][col] + "added for row" + row) ||
                            !set.add(board[row][col] + "added for col" + col) ||
                            !set.add(board[row][col] + "added for quadrant" + (row / 3) + "" +
                                    (col / 3)))
                        return false;
                }
                if (row != col && board[col][row] != '.') {
                    if (!set.add(board[col][row] + "added for row" + col) ||
                            !set.add(board[col][row] + "added for col" + row) ||
                            !set.add(board[col][row] + "added for quadrant" + (col / 3 ) + "" +
                                    (row / 3 )))
                        return false;
                }
            }
        }
        return true;
    }
}
