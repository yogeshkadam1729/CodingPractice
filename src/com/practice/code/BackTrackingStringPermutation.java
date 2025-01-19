package com.practice.code;

public class BackTrackingStringPermutation {

    public static void printStringPermutation(String str,String perm) {
        if(str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for(int i =0; i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) +str.substring(i+1);
            printStringPermutation(newStr,perm+currChar);
        }
    }
    public static void main(String args[]) {

        printStringPermutation("ABC","");

    }
}
