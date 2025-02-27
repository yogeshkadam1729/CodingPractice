package com.practice.code;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals56 {

    public int[][] merge(int[][] intervals) {
        int [][] output = new int[intervals.length][intervals[0].length];
        Arrays.sort(intervals, Comparator.comparingInt(e -> e[0]));
        int left = intervals[0][0];
        int right = intervals[0][1];

        int counter = 0;
        for(int i = 1; i < intervals.length;i++) {
            if(intervals[i][0] < right) {
                right = intervals[i][1];
            }
            else {
                output[counter][0] = left;
                output[counter][1] = right;
                left =  intervals[i][0];
                right = intervals[i][1];
                counter++;
            }
        }
        output[counter][0] = left;
        output[counter][1] = right;
        output = Arrays.copyOf(output, counter+1);
        return output;
    }
}
