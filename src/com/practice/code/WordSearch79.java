package com.practice.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordSearch79 {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int index, int row, int col, boolean[][] visited) {
        if (index == word.length()) return true;  // Word found

        int m = board.length, n = board[0].length;

        // Out of bounds or already visited or character mismatch
        if (row < 0 || row >= m || col < 0 || col >= n || visited[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }

        // Mark as visited
        visited[row][col] = true;

        // 4 directions: left, right, up, down
        int[] dr = {0, 0, -1, 1};
        int[] dc = {-1, 1, 0, 0};

        for (int i = 0; i < 4; i++) {
            if (dfs(board, word, index + 1, row + dr[i], col + dc[i], visited)) {
                return true;
            }
        }

        // Backtrack
        visited[row][col] = false;
        return false;
    }

}
