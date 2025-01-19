package com.practice.code;

import java.util.*;

public class SlidingWindowDuplicate219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++) {
            if(map.containsKey(nums[i])) {

                List<Integer> exstIdx = map.get(nums[i]);
                exstIdx.add(i);
                for(int j = 0;j<exstIdx.size()-1;j++) {
                    int a = j+1;
                    while(a<exstIdx.size() && Math.abs(exstIdx.get(j)-exstIdx.get(a)) <= k ) {
                        if(Math.abs(exstIdx.get(j)-exstIdx.get(a)) <= k) return true;
                        a++;
                    }
                }
            }
            else {
                map.put(nums[i],new ArrayList<>(Arrays.asList(i)));
            }
        }
        return false;
    }
}
