package com.practice.code;

import java.util.*;

public class JavaStreamTest {
    public static void main(String args[]) {

        //iteratir example
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("summary in List >>  sum : " + stats.getSum()+" average :"+stats.getAverage()+" count :"+stats.getCount());

        //splitterator example
        List<String> articles = new ArrayList<>(List.of("java","python","Angular","Node","SQL","Pstgres","Neo4j","MongoDB","Reddis","Docker","Github"));
        Spliterator<String> spliterator = articles.spliterator();
        spliterator.forEachRemaining(System.out::println);



    }
}
