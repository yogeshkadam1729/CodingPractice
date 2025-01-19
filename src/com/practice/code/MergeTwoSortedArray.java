package com.practice.code;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        int newNum1[] = Arrays.copyOfRange(nums1,0,m);
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n)
        {
            if(newNum1[i] < nums2[j])
            {
                nums1[k] = newNum1[i];
                i++;
            }
            else
            {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < m)
        {
            nums1[k] = newNum1[i];
            k++;
            i++;
        }
        while(j < n)
        {
            nums1[k] = nums2[j];
            k++;
            j++;
        }



    }
}

