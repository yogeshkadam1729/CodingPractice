package com.practice.code;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Jva8CustomCollector implements Collector<Integer,List<Integer>,List<Integer>> {
    @Override
    public Supplier supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Integer>,Integer> accumulator() {
        return (list,number) -> {
            list.add(number*number);
        };
    }

    @Override
    public BinaryOperator<List<Integer>> combiner() {
        return (list1,list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.emptySet();
    }


    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squares =  numbers.stream().collect(new Jva8CustomCollector());
        System.out.println(numbers);
        System.out.println(squares);
    }
}
