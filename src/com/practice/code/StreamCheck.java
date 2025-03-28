package com.practice.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamCheck{
   public static void main(String []args) {
       ForkJoinPool forkJoinPool = new ForkJoinPool(2);
       List<String> family = List.of("A","B","C","D","E","F");
       forkJoinPool.submit(() -> {
           family.parallelStream().forEach(item -> System.out.println(Thread.currentThread().getName()+" : "+item));
       }).join();

       forkJoinPool.shutdown();

       List<Integer> list = new ArrayList<>(Arrays.asList(1,4,5,6,8,2));
       int compareCondition2 = 100;
       int compareCondition1 = 200;
       IntPredicate p1 = (var a) -> a > compareCondition1 ;
       IntPredicate p2 = (var a) -> a < compareCondition2 ;
       list.stream().filter(e -> p1.test(e) && p2.test(e)).collect(Collectors.toSet());


   }
}
