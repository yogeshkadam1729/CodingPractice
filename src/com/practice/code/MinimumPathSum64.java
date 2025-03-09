package com.practice.code;

public class MinimumPathSum64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int row=0; row < m;row++){
            for(int col=0;col < n;col++){
                if(row == 0 && col == 0) continue;
                if (row == 0) {
                    grid[row][col] += grid[row][col - 1]; // First row: can only come from left
                } else if (col == 0) {
                    grid[row][col] += grid[row - 1][col]; // First column: can only come from top
                } else {
                    grid[row][col] += Math.min(grid[row - 1][col], grid[row][col - 1]); // Take the minimum of top and left
                }
            }
        }
        return grid[m-1][n-1];
    }
    public int minPathSumDP(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n];

        dp[0] = grid[0][0]; // Initialize the first cell

        // Precompute the first row (only left moves)
        for (int col = 1; col < n; col++) {
            dp[col] = dp[col - 1] + grid[0][col];
        }

        for (int row = 1; row < m; row++) {
            dp[0] += grid[row][0]; // Update first column (only top moves)
            for (int col = 1; col < n; col++) {
                dp[col] = Math.min(dp[col], dp[col - 1]) + grid[row][col]; // Min of top & left
            }
        }
        return dp[n - 1]; // The last element has the result
    }

}
