package com.practice.code;

import com.practice.designPatterns.structural.proxy.CommandExecutorDriver;
import com.practice.designPatterns.structural.proxy.CommandExecutorProxy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


public class  TestCode {

    public static void main(String args[]) {
       CoinChange322 coinChange322 = new CoinChange322();
       coinChange322.coinChange(new int[]{1,2,5},11);
    }

}
