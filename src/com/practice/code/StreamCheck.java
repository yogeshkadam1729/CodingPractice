package com.practice.code;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class StreamCheck{
   public static void main(String []args) {
       ForkJoinPool forkJoinPool = new ForkJoinPool(2);
       List<String> family = List.of("A","B","C","D","E","F");
       forkJoinPool.submit(() -> {
           family.parallelStream().forEach(item -> System.out.println(Thread.currentThread().getName()+" : "+item));
       }).join();

       forkJoinPool.shutdown();

   }
}
