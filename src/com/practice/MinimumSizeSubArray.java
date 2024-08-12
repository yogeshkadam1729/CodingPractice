package com.practice;

public class MinimumSizeSubArray {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0;
        int output = 0;
        while(i <= nums.length-1) {
            int p = i;
            int tempSum = 0;
            int size = 0;
            while(tempSum <= target && p <= nums.length-1) {
                tempSum = tempSum + nums[p];
                size++;
                p++;
            }
            if(tempSum == target) {
                if(output == 0 || output > size) output = size;
            }
            i++;
        }
        return output;
    }
}

