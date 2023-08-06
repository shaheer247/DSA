package com.Arrays;

import java.util.Arrays;

public class Bubble_Sort {
    public static void Bubblesort(int[]arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            boolean swap=false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }

    }

    public static void main(String[] args) {
        int []nums={64,25,12,22,11};
        int n=nums.length;
        System.out.println(Arrays.toString(nums));
        Bubblesort(nums);
        System.out.println("Array After sorting:");
        System.out.println(Arrays.toString(nums));
    }
}
