package com.practice.code;

public class ReverseBits190 {
    public int reverseBits(int n) {
        int result = 0;
        for(int i =0; i < 32;i++) {
           int lsb = n & 1; //this will give least significant bit of binary
           int reverseLsb =  lsb << (31-i); // this will shift to right least bit to speccified location
           result = result | reverseLsb; // OR with result to preserve the reverse bit in the original result
           n = n >> 1; // right shift the bit by 1 for original n . to perform above operation on next least bit
        }
        return result;
    }
}
