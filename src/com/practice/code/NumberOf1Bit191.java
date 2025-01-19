package com.practice.code;

public class NumberOf1Bit191 {
    public static void main(String args[]) {
        int n = 11;
        int count = 0;
        while(n > 0) {
            if(n%2 != 0) count++;
            n = n/2;
        }

        System.out.println(count);

    }
}
