package com.practice.code;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SnakeLadder909 {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int minRoll = 0;
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[][] = new boolean[n][n];
        queue.add(1);
        visited[n-1][0] = true;
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0){
                int currval = queue.poll();
                if(currval == n*n) return minRoll;
                for(int dicValue = 1;dicValue<=6;dicValue++) {
                    if(currval+dicValue > n*n) continue;
                    int pos[] = findCordinates(currval+dicValue,n);
                    int row = pos[0];
                    int col = pos[1];
                    if(visited[row][col] == true) continue;
                    visited[row][col] = true;
                    if(board[row][col] == -1)
                        queue.add(dicValue+currval);
                    else
                        queue.add(board[row][col]);
                }
            }
            minRoll++;
        }

        return -1;
    }
    private int[] findCordinates(int currVal,int n) {
        int r = n - (currVal-1)/n-1;
        int c = (currVal-1) % n;
        if ((n - r) % 2 == 0) { // If the row is even, reverse column order
            c = n - 1 - c;
        }
        return new int[]{r,c};
    }

}
