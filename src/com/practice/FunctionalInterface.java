package com.practice;

public interface FunctionalInterface {

    static void printResult(int num) {
        System.out.println(num);
    }
    static int doSquare(int a) { return a*a;}
    default int doAdd(int a, int b)  { return a+b;}
}
