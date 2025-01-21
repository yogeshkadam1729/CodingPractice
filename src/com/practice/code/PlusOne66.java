package com.practice.code;

import java.util.Arrays;

public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length-1;
        int sum = (digits[lastIndex] + 1) % 10;
        int accum = (digits[lastIndex] + 1) / 10;
        digits[lastIndex] = sum;
        for(int i = lastIndex-1;i>=0;i--){
            sum = digits[i]+accum;
            accum = (sum/10 >= 1) ? 1 : sum / 10;
            sum = sum % 10;
            digits[i] = sum;
        }
        if(accum > 0) {
            int [] newDigits = new int[digits.length+1];
            newDigits[0] = accum;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            return newDigits;
        }
        else {
            return digits;
        }
    }
}
