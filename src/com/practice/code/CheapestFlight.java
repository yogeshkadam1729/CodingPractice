package com.practice.code;

import java.util.*;

class CheapestFlight {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // Step 1: Build Graph (Adjacency List)
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] flight : flights) {
            graph.computeIfAbsent(flight[0], x -> new ArrayList<>()).add(new int[]{flight[1], flight[2]});
        }

        // Step 2: Min Heap (cost, city, remaining stops)
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, src, k + 1});

        // Step 3: BFS Processing
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int cost = current[0], city = current[1], stops = current[2];

            // Step 4: If we reach destination, return cost
            if (city == dst) return cost;

            // Step 5: If stops left, explore neighbors
            if (stops > 0) {
                for (int[] neighbor : graph.getOrDefault(city, new ArrayList<>())) {
                    int nextCity = neighbor[0], price = neighbor[1];
                    pq.offer(new int[]{cost + price, nextCity, stops - 1});
                }
            }
        }
        return -1;  // If no valid route found
    }

    public static void main(String[] args) {
        CheapestFlight cf = new CheapestFlight();
        int n = 3;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0, dst = 2, k = 1;
        System.out.println(cf.findCheapestPrice(n, flights, src, dst, k)); // Output: 200
    }
}

