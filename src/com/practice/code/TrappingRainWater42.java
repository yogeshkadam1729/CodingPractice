package com.practice.code;

import java.util.ArrayList;
import java.util.List;

public class TrappingRainWater42 {
    public int trap(int[] height) {
        int i = 0 , j = height.length-1, maxLeft = 0, maxRight = 0, water = 0;
        while(i < j) {
            if(height[i] <= height[j]) {
                maxLeft = Math.max(maxLeft,height[i]);
                water += maxLeft-height[i];
                i++;
            }
            else {
                maxRight = Math.max(maxRight,height[j]);
                water += maxRight-height[j];
                j--;
            }
        }
        return water;
    }
}
