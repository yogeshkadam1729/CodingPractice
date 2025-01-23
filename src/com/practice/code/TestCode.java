package com.practice.code;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestCode {
    public static void main(String args[]) throws IOException {
        MaxSubArray53 maxSubArray53 = new MaxSubArray53();
        int sum = maxSubArray53.maxSubarraySumCircular(new int[]{1,-2,3,-2});
        System.out.println(sum);
    }

}
