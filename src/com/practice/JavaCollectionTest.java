package com.practice;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.*;

public class JavaCollectionTest {
    public static void main(String args[]) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(12);
        queue.add(11);
        queue.poll();
        System.out.println(queue);
    }
}
