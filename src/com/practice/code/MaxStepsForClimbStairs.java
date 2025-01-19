package com.practice.code;

import java.util.HashMap;

public class MaxStepsForClimbStairs {

    public int climbStairs(int n)
    {
        if(n == 1 || n == 2) return n;
        int [] combination = new int [] {1,2};
        for(int i=3;i<=n;i++)
        {
            int result = combination[0]+combination[1];
            combination[0] = combination[1];
            combination[1] = result;
        }
        return combination[1];
    }

    public static void main(String args[]) {
        MaxStepsForClimbStairs mx = new MaxStepsForClimbStairs();
        System.out.println(mx.climbStairs(3));
    }

}

