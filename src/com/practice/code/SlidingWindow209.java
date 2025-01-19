package com.practice.code;

public class SlidingWindow209 {
    public static void main(String args[]) {
        int target = 3;
        int[] nums = {1,1,1,3};
        System.out.println(minSubArrayLen2(target,nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n = 0;
        for(int i=0;i< nums.length;i++) {
            if(nums[i] == target) return 1;
            int j = i+1;
            int tempNum = nums[i];
            int k = 1;
            while(tempNum<target && j < nums.length) {
                tempNum = tempNum + nums[j];
                if(tempNum == target)
                    n = (n==0 || n > k+1) ? k+1 : n;
                j++;
                k++;
            }
        }
        return n;
    }
    public static int minSubArrayLen2(int target, int[] nums) {
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
