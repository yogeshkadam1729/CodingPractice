package com.practice;

public interface Square {
    int calculate(int a);
    default void printResult(int result) {
        System.out.println(result);
    }



}
