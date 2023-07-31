package com.Arrays;
public class Sumofarray {
    //sum of array elements
    public static void sumof(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Total sum of array:" + sum);
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
        sumof(nums,n);
    }
}
