package com.practice.code;

public class ArrayDuplicate26 {

    public int removeDuplicates(int[] nums) {
        int j = 0; int prev = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length;i++) {
            if(nums[i] != prev) {
                prev = nums[i];
                int temp = nums[i];
                nums[i] = 0;
                nums[j] = temp;
                j++;
            }
            else {
                nums[i] = 0;
            }
        }

        return j;
    }
}
