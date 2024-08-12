package com.practice;

import java.util.PriorityQueue;

public class PriorityQueueKthLargest {
    // Function to find k largest array element
    static int  kLargest(int a[], int n, int k)
    {

        PriorityQueue<Integer> pq
                = new PriorityQueue<Integer>();

        for (int i = 0; i < n; ++i) {

            pq.add(a[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
    public static void main(String[] args)
    {
        int a[]= { 3,2,1,5,6,4 };
        int n = a.length;
        int k = 2;
        System.out.print(k + " largest elements are : "+kLargest(a, n, k));

    }
}

