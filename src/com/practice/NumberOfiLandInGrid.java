package com.practice;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class NumberOfiLandInGrid {
    public int numIslands(char[][] grid) {
        int numLands = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        if(grid.length == 0) return  0;
        for(int i =0;i<rows;i++)
        {
            for(int j =0;j<columns;j++)
            {
                System.out.println(" i-> "+ i +" j-> "+j);
                if(grid[i][j] == '1')
                {
                    checkBoundary(grid,rows,columns,i,j);
                    numLands = numLands+1;

                }

            }
        }
        String result = Arrays.stream(grid)
                .map(row -> new String(row))
                .collect(Collectors.joining("\n"));
        System.out.println(result);

        return numLands;
    }
    public void checkBoundary(char[][] grid,int rows,int columns, int i,int j)
    {
        if(i < 0 || i >= rows || j < 0 || j >= columns || grid[i][j] != '1')
            return;

        grid[i][j] = '2';

        checkBoundary(grid,rows,columns,i+1,j);
        checkBoundary(grid,rows,columns,i-1,j);
        checkBoundary(grid,rows,columns,i,j+1);
        checkBoundary(grid,rows,columns,i,j-1);

    }

}

