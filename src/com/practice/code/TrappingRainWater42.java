package com.practice.code;

import java.util.ArrayList;
import java.util.List;

public class TrappingRainWater42 {
    public int trap(int[] height) {
        int n = height.length;
        int predictedReserve = 0;
        int actualReserve = 0;
        int high = 0;
        List<Integer> store = new ArrayList<>(n);
        for(int i =0 ; i<n;i++) {
            if(height[i] > high) {
                high = height[i];
                actualReserve = predictedReserve;
                store = new ArrayList<>(n);
            }
            else {
                predictedReserve = predictedReserve + (high-height[i]);
                if(i != 0 && i != n-1 && height[i] < height[i-1]) {
                    store.add(height[i]);
                }
                else {
                    for(int tap : store) {
                        actualReserve += (height[i] - tap > 0) ? height[i] - tap : 0;
                    }
                    store = new ArrayList<>(n);
                }
            }
        }
        return actualReserve;
    }
}
