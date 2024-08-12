package com.practice;

import java.util.HashSet;
import java.util.function.Function;

public class HashSetCheck {
    public static void main(String args[]) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(21);
        numbers.add(1);
        System.out.println(numbers);
    }

    public void acceptFunctionalInterface(Function f) {
        System.out.println(f.apply(23));
    }
}
