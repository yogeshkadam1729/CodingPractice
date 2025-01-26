package com.practice.code;

public class KthLargestElementArray {

    public int KthLargest(int arr[],int k)
    {
        int pivotIndex = 0;
        int low = 0;
        int high = arr.length-1;
        while(true) {
            pivotIndex = partition(arr,low,high);
            if(pivotIndex == k-1) {
                break;
            }
            else if(pivotIndex > k-1) {
                high = pivotIndex-1;
            }
            else {
                low = pivotIndex+1;
            }
        }
        return arr[pivotIndex];
    }

    public int partition(int arr[],int low,int high) {
        int i = low-1;
        int pivot = arr[high];
        for(int j = low; j<high;j++){
            if(arr[low] > pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;

    }


}
