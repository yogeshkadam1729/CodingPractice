package com.practice.code;

public class TwoSum167 {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0,j = numbers.length-1;i<j;){
            int sum = numbers[i]+numbers[j];
            if(sum == target) {
                return new int[]{i+1,j+1};
            }
            if(sum > target) j--;
            if(sum < target) i++;
        }
        return null;
    }
}
