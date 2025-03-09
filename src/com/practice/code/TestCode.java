package com.practice.code;

import com.practice.designPatterns.structural.proxy.CommandExecutorDriver;
import com.practice.designPatterns.structural.proxy.CommandExecutorProxy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


public class  TestCode {

    public static void main(String args[]) {
       GasStation134 gasStation134 = new GasStation134();

       // System.out.println(minimumPathSum64.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
       System.out.println(gasStation134.canCompleteCircuit(new int[]{1, 2, 3, 4, 5},new int[]{3, 4, 5, 1, 2}));

    }

}
