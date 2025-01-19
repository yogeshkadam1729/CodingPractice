package com.practice.code;

import java.util.function.BiFunction;

public class LambdaWithVarJava11 {

    public static  void main(String args []) {
        // Lambda without var
        BiFunction<String, String, Integer> traditionalLambda = (s1, s2) -> s1.length() + s2.length();

        // Lambda with var
        BiFunction<String, String, Integer> lambdaWithVar = ( var s1,  var s2) -> s1.length() + s2.length();

        // Using the lambda
        System.out.println(traditionalLambda.apply("Hello", "World"));  // Output: 10
        System.out.println(lambdaWithVar.apply("Hello", "World"));
    }
}
