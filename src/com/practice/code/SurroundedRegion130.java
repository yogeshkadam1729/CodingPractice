package com.practice.code;

import java.util.ArrayList;
import java.util.List;

public class SurroundedRegion130 {
    public void solve(char[][] board) {
        int  columnLengthIndex = board[0].length -1 ;
        int  rowLengthIndex = board.length - 1 ;
        //findRegions(board,columnLengthIndex,rowLengthIndex,findChar,markChar);
        for(int i =0; i< board[0].length;i++) {
            if(board[0][i] == 'O')
                markSurroundingRegions(board,0,i);
            if(board[board.length-1][i] == 'O')
                markSurroundingRegions(board,board.length-1,i);
        }
        for(int i =0; i< board.length;i++) {
            if(board[i][0] == 'O')
                markSurroundingRegions(board,i,0);
            if(board[i][board[0].length-1] == 'O')
                markSurroundingRegions(board,i,board[0].length-1);
        }
        for(int i = 0; i <=rowLengthIndex;i++) {
            for(int j = 0;j<=columnLengthIndex;j++) {
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == '#') board[i][j] = 'O';
            }
        }

    }

    /*private void findRegions(char[][] board,int columnLengthIndex,int rowLengthIndex,char findChar,char markChar)
    {
        int i = 0;
        for(int j=0;j<=columnLengthIndex;j++) {
            System.out.println(" i = "+i+" j = "+j);
            if(i <= rowLengthIndex && j<= columnLengthIndex && board[i][j] == findChar)
                markSurroundingRegions(board,i,j,columnLengthIndex,rowLengthIndex,findChar,markChar);
            if(j <= rowLengthIndex && i<= columnLengthIndex && board[j][i] == findChar)
                markSurroundingRegions(board,j,i,columnLengthIndex,rowLengthIndex,findChar,markChar);
            if(rowLengthIndex-i >= 0 && columnLengthIndex-j >=0 && rowLengthIndex-i <= rowLengthIndex && columnLengthIndex-j<= columnLengthIndex && board[rowLengthIndex-i][columnLengthIndex-j] == findChar)
                markSurroundingRegions(board,rowLengthIndex-i,columnLengthIndex-j,columnLengthIndex,rowLengthIndex,findChar,markChar);
            if(rowLengthIndex-j >= 0 && columnLengthIndex-i >=0  && rowLengthIndex-j <= rowLengthIndex && columnLengthIndex-i<= columnLengthIndex && board[rowLengthIndex-j][columnLengthIndex-i] == findChar)
                markSurroundingRegions(board,rowLengthIndex-j,columnLengthIndex-i,columnLengthIndex,rowLengthIndex,findChar,markChar);
        }
    }*/

    private void markSurroundingRegions(char[][] board,int i,int j) {
        if(i < 0 || i>= board.length || j<0 || j>= board[0].length || board[i][j] != 'O') return;

        board[i][j] = '#';
        markSurroundingRegions(board,i+1,j);
        markSurroundingRegions(board,i-1,j);
        markSurroundingRegions(board,i,j+1);
        markSurroundingRegions(board,i,j-1);
    }

}
