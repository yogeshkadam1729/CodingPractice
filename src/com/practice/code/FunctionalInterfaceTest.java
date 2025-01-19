package com.practice.code;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaceTest {

    public void printMsg()
    {
        System.out.println("hello");
    }
    public static void main(String args[])
    {
        List<Integer> numList = List.of(1,2,3,4,5);
        Function<Integer,Integer> plusOne = (a) -> a+1;
        numList.stream().forEach(e -> System.out.println(plusOne.apply(e)));
        Supplier<StringBuilder> appender = StringBuilder::new;

        FunctionalInterface f = (int a, int b) -> a * b;

        Supplier<String> stringSupplier = () -> "Hello World";
        System.out.println(stringSupplier.get());
        List<String> list = new ArrayList<>(Arrays.asList("yogesh","yogesh1","yogesh2","test"));
        /*Square s = (int x) -> x*x;
        Square  s1 = (int x) -> x+x;
        int a = s.calculate(5);
        int b = s1.calculate(5);*/

        /*Thread t = new Thread(new FunctionalInterfaceTest()::printMsg);
        t.start();*/
       List<String> vowels = List.of("a", "e", "i", "o", "u");
// sequential stream - nothing to combine
        StringBuilder result = vowels.stream().collect(StringBuilder::new, (x, y) -> x.append(y),
                (a, b) -> a.append(",").append(b));
        System.out.println(result.toString());
// parallel stream - combiner is combining partial results
        StringBuilder result1 = vowels.parallelStream().collect(StringBuilder::new, (x, y) -> x.append(y),
                (a, b) -> a.append(",").append(b));
        System.out.println(result1.toString());
        Collections.unmodifiableList(new ArrayList<>(Arrays.asList("a","b","c","d")));
        Collections.singletonList(new ArrayList<>(Arrays.asList("a","b","c","d")));
        List<String> singletonList = Collections.singletonList("A");
        //check the supplier
        Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100);
        System.out.println(randomNumberSupplier.get());
        System.out.println(randomNumberSupplier.get());

        //BinaryOpeartor test
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int output = math(numbers,0,(a,b) -> a+b);
        System.out.println(output);

    }

    public static <T> T math(List<T> list,T init,BinaryOperator<T> accumulator) {
        T result = init;
        for(T t : list) {
            result = accumulator.apply(result,t);
        }

        return result;
    }
}
