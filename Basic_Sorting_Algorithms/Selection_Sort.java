package com.Arrays;

import java.util.Arrays;

public class Selection_Sort {
    public static void selectionsort(int []arr,int n) {
        n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j =i + 1; j < n ; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        }

    public static void main(String[] args) {
	    int []nums={64,25,12,22,11};
        int n= nums.length;
        System.out.println(Arrays.toString(nums));
        selectionsort(nums,n);
        System.out.println("Array After sorting:");
        System.out.println(Arrays.toString(nums));

    }
}
