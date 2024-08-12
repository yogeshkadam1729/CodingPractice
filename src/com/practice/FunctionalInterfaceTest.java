package com.practice;

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
        numList.stream().forEach(e -> FunctionalInterface.printResult(FunctionalInterface.doSquare(e)));




        List<String> list = new ArrayList<>(Arrays.asList("yogesh","yogesh1","yogesh2","test"));
        /*Square s = (int x) -> x*x;
        Square  s1 = (int x) -> x+x;
        int a = s.calculate(5);
        int b = s1.calculate(5);*/

        /*Thread t = new Thread(new FunctionalInterfaceTest()::printMsg);
        t.start();*/
       /*List<String> vowels = List.of("a", "e", "i", "o", "u");
// sequential stream - nothing to combine
        StringBuilder result = vowels.stream().collect(StringBuilder::new, (x, y) -> x.append(y),
                (a, b) -> a.append(",").append(b));
        System.out.println(result.toString());
// parallel stream - combiner is combining partial results
        StringBuilder result1 = vowels.parallelStream().collect(StringBuilder::new, (x, y) -> x.append(y),
                (a, b) -> a.append(",").append(b));
        System.out.println(result1.toString());
        Collections.unmodifiableList(new ArrayList<>(Arrays.asList("a","b","c","d")));
        Collections.singletonList(new ArrayList<>(Arrays.asList("a","b","c","d")));*/

        //check the supplier
        /*Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100);
        System.out.println(randomNumberSupplier.get());
        System.out.println(randomNumberSupplier.get());*/

        //check normal input output function
        /*Function<Integer, String> intToString = num -> "Number: " + num;
        System.out.println(intToString.apply(42)); // "Number: 42"*/

        /*Function<Integer,String> intToStringconversion = (num) -> {
            return "Number is converted to "+num;
        };

        new HashSetCheck().acceptFunctionalInterface(intToStringconversion);*/


    }
}
