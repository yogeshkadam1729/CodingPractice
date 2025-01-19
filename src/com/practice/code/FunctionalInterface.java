package com.practice.code;

public interface FunctionalInterface {

    static void printResult(int num) {
        System.out.println(num);
    }
    static int doSquare(int a) { return a*a;}
    default int doAdd(int a, int b)  { return a+b;}
    default int doSub(int a,int b) { return a-b;}
    //int calculate(int x);
    abstract int calculate1(int x,int y);

}
