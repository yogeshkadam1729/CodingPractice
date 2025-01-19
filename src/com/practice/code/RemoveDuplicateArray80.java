package com.practice.code;

public class RemoveDuplicateArray80 {

    public static void main(String args[]) {
        int nums[] = {1,1,1,2,2,3};
        int count = 1;
        int j =1;
        for(int i=1;i< nums.length;i++) {
            if(nums[i] == nums[i-1])
              count = count + 1;
            else
               count = 1;
            if(count <=2) {
                nums[j] = nums[i];
                j = j+1;
            }
        }
        System.out.println(j);
    }
}
