package com.practice.code;

public class HouseRobber198 {

    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        int d2Profit = nums[0];
        int d1Profit = nums[1];
        for(int i = 2;i< nums.length;i++) {
            int temp1 = d1Profit - nums[i-1]+nums[i];
            int temp2 = d2Profit+nums[i];
            d2Profit = d1Profit;
            d1Profit = Math.max(temp1,temp2);
        }
        return Math.max(d1Profit,d2Profit);
    }

}
