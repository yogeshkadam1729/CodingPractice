package com.practice.code;

public class SlidingWindow209 {
    public static void main(String args[]) {
        int target = 3;
        int[] nums = {1,1,1,3};
        System.out.println(minSubArrayLen(target,nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sumOfCurrentWindow = 0;
        int res = Integer.MAX_VALUE;

        for(right = 0; right < nums.length; right++) {
            sumOfCurrentWindow += nums[right];

            while (sumOfCurrentWindow >= target) {
                res = Math.min(res, right - left + 1);
                sumOfCurrentWindow -= nums[left++];
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }

}
