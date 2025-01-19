package com.practice.code;

public interface Square {
    int calculate(int a);
    default void printResult(int result) {
        System.out.println(result);
    }



}
