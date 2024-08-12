package com.practice;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(target == nums[mid]) return mid;
            if(nums[mid] < target) {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }

        return Math.max(left,right);

    }


}

