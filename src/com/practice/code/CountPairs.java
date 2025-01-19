package com.practice.code;

import java.util.HashMap;
import java.util.Map;

public class CountPairs {

    // Function to count pairs with given sum
    static int countPairs(int[] arr, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            // Update the count of the current element in
            // the map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 5, 7, -1, 5 };
        int target = 6;

        System.out.println(countPairs(arr, target));
    }
}
