package com.practice;

import java.util.*;

public class JavaStreamTest {
    public static void main(String args[]) {

        //iteratir example
        /*List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Lowest number in List : " + stats.getSum());*/

        //splitterator example
        List<String> articles = new ArrayList<>(List.of("java","python","Angular","Node","SQL","Pstgres","Neo4j","MongoDB","Reddis","Docker","Github"));
        Spliterator<String> spliterator = articles.spliterator();
        while(spliterator.tryAdvance(article -> article.toLowerCase()));
        System.out.println(spliterator.characteristics());


    }
}
