package com.practice.code;

import java.util.*;

public class FindMissingAndRepeatedValues2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeated = -1;
        int missing = -1;
        int n = grid.length;
        int size = n * n;
        int sum = (size * (size + 1)) / 2;
        Set<Integer> numbers = new HashSet<>(size);
        for(int row=0;row<n;row++){
            for(int col=0;col<grid[row].length;col++) {
                if(!numbers.contains(grid[row][col])) {
                    numbers.add(grid[row][col]);
                    sum = sum - grid[row][col];
                } else {
                    repeated = grid[row][col];
                }
            }
        }

       return new int[]{repeated,sum};
    }
}
