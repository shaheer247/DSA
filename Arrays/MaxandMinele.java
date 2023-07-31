package com.Arrays;

public class MaxandMinele {
    //max and min element in array
    public static void maxminarr(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("maximum value:" + max);
        System.out.println("minimum value:" + min);

    }
    public static void main(String[] args) {
        int []nums={1,2,3,4};
        int n = nums.length;
        //Printing Array
        System.out.println("The Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        maxminarr(nums,n);
    }
}
