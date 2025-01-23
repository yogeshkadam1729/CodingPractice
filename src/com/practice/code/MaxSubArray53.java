package com.practice.code;

public class MaxSubArray53 {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int num : nums){
            currentSum += num;
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public int maxSubarraySumCircular(int[] nums) {
        //solution not working correctly..plz check
        int arraySum = 0;
        int maxSubArraySum = 0;
        for(int num : nums) {
            arraySum += -num;
            if(-num < 0)
                maxSubArraySum = 0;
            else
                maxSubArraySum += -num;

        }

        return -(arraySum-maxSubArraySum);
    }

}
