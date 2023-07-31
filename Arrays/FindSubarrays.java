package com.Arrays;

public class FindSubarrays {
    //sub arrays
    public static void printsubarrays(int arr[], int n) {
        n = arr.length;
        //start loop
        for (int i = 0; i < n; i++) {
            int start = i;//Start
            //End loop
            for (int j = i; j < n; j++) {
                int end = j;//start
                for (int k = start; k <= end; k++) { //printing
                    System.out.print(arr[k] + " ");//Sub arrays
                }
                System.out.println();
            }
            System.out.println();
        }
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
        printsubarrays(nums,n);
    }
}
