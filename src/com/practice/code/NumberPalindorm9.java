package com.practice.code;

public class NumberPalindorm9 {
    public static void main(String args[]) {
        int x = -121;
        /*String xString = String.valueOf(x);
        int n = xString.length();
        int mid = n/2;
        boolean isPlandrom = true;
        for(int i=0,j=n-1;i < mid;i++,j--){
            if(xString.charAt(i) != xString.charAt(j)) {
                isPlandrom = false;
                break;
            }
        }*/
        int originalNumber = x;
        int reversedNumber = 0;

        while (x != 0) {
            int digit = x % 10;         // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            x /= 10;                   // Remove the last digit
        }

        System.out.println(originalNumber == reversedNumber);

    }
}
