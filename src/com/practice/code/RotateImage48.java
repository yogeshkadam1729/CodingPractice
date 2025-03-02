package com.practice.code;

public class RotateImage48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<(n+1)/2;i++) {
            for(int j=0;j<n/2;j++){
                //bottom left
                int temp = matrix[n-1-j][i];

                //bottom left = bottom right
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];

                //bottom right = top right
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];

                //top right = top left
                matrix[j][n-1-i] = matrix[i][j];

                //top left = temp
                matrix[i][j] = temp;
            }
        }
    }
}
