package com.practice.code;

import java.util.Arrays;

public class QuickSort {

    private static int partition(int arr[],int low,int high) {
        int i = low-1;
        int pivot = arr[high];
        for(int j =low;j<high;j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;

    }
    private static  void quickSort(int arr[],int low,int high) {
        if(low < high){
            int pivotIndex = partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }



    public static void main(String args[]) {
        int[] arr = new int[] {5,3,12,14,6,10};
        quickSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
