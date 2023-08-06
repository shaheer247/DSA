package com.Arrays;

import java.util.Arrays;

public class Insertion_sort {
    public static void insertionSort(int []arr,int n){
        n= arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while ( j>=0){
                if(arr[j]>temp) {
                    //shift
                    arr[j + 1] = arr[j];
                }
                else{
                    break;
                }
                j--;
                }
            arr[j+1]=temp;
            }
    }

    public static void main(String[] args) {
        int [] nums={9,7,6,1,5,3};
        int n=nums.length;
        System.out.println(Arrays.toString(nums));
        System.out.println("After Sorting:");
        insertionSort(nums,n);
        System.out.println(Arrays.toString(nums));

    }
}
